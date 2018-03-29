package top.lixiaogang.pattern.builder.impl;

import top.lixiaogang.pattern.builder.Item;
import top.lixiaogang.pattern.builder.Packing;

/**
 * Created by lixiaogang on 2018/3/29.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing pack() {
        return new Bottle();
    }

}
