package top.lixiaogang.pattern.facade.impl;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.facade.Shape;

/**
 * Created by lixiaogang on 2018/3/27.
 */
@Slf4j
public class Square implements Shape {

    @Override
    public void draw() {
        log.info("draw Square");
    }
}
