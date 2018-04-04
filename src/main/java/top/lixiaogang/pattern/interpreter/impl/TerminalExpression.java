package top.lixiaogang.pattern.interpreter.impl;

import top.lixiaogang.pattern.interpreter.Expression;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
