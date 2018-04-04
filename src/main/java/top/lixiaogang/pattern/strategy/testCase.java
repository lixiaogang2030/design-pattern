package top.lixiaogang.pattern.strategy;

import top.lixiaogang.pattern.strategy.impl.OperationAdd;
import top.lixiaogang.pattern.strategy.impl.OperationSub;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class testCase {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSub());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}
