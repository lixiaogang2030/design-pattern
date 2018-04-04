package top.lixiaogang.pattern.proxy.impl;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.proxy.Image;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void disPlay() {
       log.info("disPlay {}", fileName);
    }
}
