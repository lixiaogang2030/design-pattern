package top.lixiaogang.pattern.visitor.impl;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.visitor.ComputerPart;
import top.lixiaogang.pattern.visitor.ComputerPartVisitor;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class ComputerPartDisplayVistor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        log.info("display computer");
    }

    @Override
    public void visit(Mouse mouse) {
        log.info("display mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        log.info("display keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        log.info("display monitor");
    }
}
