package top.lixiaogang.pattern.bridge.impl;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.bridge.DrawApi;

/**
 * Created by lixiaogang on 2018/3/30.
 * 实现了 DrawAPI 接口的实体桥接实现类。
 */
@Slf4j
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        log.info("RedCircle, radius:{}, x:{}, y:{}", radius, x, y);
    }
}
