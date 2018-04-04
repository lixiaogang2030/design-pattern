package top.lixiaogang.pattern.visitor.impl;

import top.lixiaogang.pattern.visitor.ComputerPart;
import top.lixiaogang.pattern.visitor.ComputerPartVisitor;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
