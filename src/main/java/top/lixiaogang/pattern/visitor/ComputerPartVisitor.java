package top.lixiaogang.pattern.visitor;

import top.lixiaogang.pattern.visitor.impl.Computer;
import top.lixiaogang.pattern.visitor.impl.Keyboard;
import top.lixiaogang.pattern.visitor.impl.Monitor;
import top.lixiaogang.pattern.visitor.impl.Mouse;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public interface ComputerPartVisitor {
     void visit(Computer computer);
     void visit(Mouse mouse);
     void visit(Keyboard keyboard);
     void visit(Monitor monitor);
}
