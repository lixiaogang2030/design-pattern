package top.lixiaogang.pattern.builder;

import top.lixiaogang.pattern.builder.impl.Burger;
import top.lixiaogang.pattern.builder.impl.ColdDrink;

/**
 * Created by lixiaogang on 2018/3/29.
 */
public class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 4.99f;
    }
}
