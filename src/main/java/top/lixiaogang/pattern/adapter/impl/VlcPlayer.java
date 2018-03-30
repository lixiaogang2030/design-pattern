package top.lixiaogang.pattern.adapter.impl;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.adapter.AdvanceMediaPlayer;

/**
 * Created by lixiaogang on 2018/3/30.
 */
@Slf4j
public class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        log.info("play vlc");
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
