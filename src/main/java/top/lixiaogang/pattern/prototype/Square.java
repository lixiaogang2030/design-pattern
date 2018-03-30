package top.lixiaogang.pattern.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/3/30.
 * 扩展了抽象类的实体类
 */
@Slf4j
public class Square extends Shape{

    public Square() {
        setType("Square");
    }

    @Override
    void draw() {
        log.info("draw Square");
    }
}
