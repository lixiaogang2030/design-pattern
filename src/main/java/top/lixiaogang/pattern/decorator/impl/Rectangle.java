package top.lixiaogang.pattern.decorator.impl;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.decorator.Shape;

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
