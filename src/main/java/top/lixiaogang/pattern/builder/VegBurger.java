package top.lixiaogang.pattern.builder;

import top.lixiaogang.pattern.builder.impl.Burger;

/**
 * Created by lixiaogang on 2018/3/29.
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 24.99f;
    }
}
