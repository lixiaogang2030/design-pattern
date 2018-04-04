package top.lixiaogang.pattern.strategy.impl;

import top.lixiaogang.pattern.strategy.Strategy;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class OperationSub implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
