package top.lixiaogang.pattern.visitor.impl;

import top.lixiaogang.pattern.visitor.ComputerPart;
import top.lixiaogang.pattern.visitor.ComputerPartVisitor;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
