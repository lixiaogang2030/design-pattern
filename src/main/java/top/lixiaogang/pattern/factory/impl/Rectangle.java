package top.lixiaogang.pattern.factory.impl;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.factory.Shape;

/**
 * Created by lixiaogang on 2018/3/27.
 */
@Slf4j
public class Rectangle implements Shape {

    @Override
    public void draw() {
        log.info("draw Rectangle");
    }

}
