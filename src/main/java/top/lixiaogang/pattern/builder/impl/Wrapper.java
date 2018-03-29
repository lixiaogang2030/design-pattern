package top.lixiaogang.pattern.builder.impl;

import top.lixiaogang.pattern.builder.Packing;

/**
 * Created by lixiaogang on 2018/3/29.
 * 包装类
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper";
    }
}
