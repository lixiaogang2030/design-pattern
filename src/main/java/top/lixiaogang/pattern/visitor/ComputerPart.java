package top.lixiaogang.pattern.visitor;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
