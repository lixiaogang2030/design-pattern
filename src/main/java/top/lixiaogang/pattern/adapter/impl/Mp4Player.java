package top.lixiaogang.pattern.adapter.impl;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.adapter.AdvanceMediaPlayer;

/**
 * Created by lixiaogang on 2018/3/30.
 */
@Slf4j
public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        log.info("play mp4");
    }
}
