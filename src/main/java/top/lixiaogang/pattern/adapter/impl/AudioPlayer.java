package top.lixiaogang.pattern.adapter.impl;

import top.lixiaogang.pattern.adapter.MediaAdapter;
import top.lixiaogang.pattern.adapter.MediaPlayer;

/**
 * Created by lixiaogang on 2018/3/30.
 * 播放器实现类
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String fileName) {
        mediaAdapter = new MediaAdapter(audioType);
        mediaAdapter.play(audioType, fileName);
    }
}
