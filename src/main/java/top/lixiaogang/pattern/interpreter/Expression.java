package top.lixiaogang.pattern.interpreter;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public interface Expression {
    boolean interpret(String context);
}
