package top.lixiaogang.pattern.abstractfactory.impl;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.abstractfactory.Color;

/**
 * Created by lixiaogang on 2018/3/28.
 */
@Slf4j
public class Red implements Color {

    @Override
    public void fill() {
        log.info("fill Red");
    }
}
