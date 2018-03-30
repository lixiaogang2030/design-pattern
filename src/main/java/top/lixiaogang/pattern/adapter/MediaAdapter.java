package top.lixiaogang.pattern.adapter;

import top.lixiaogang.pattern.adapter.impl.Mp4Player;
import top.lixiaogang.pattern.adapter.impl.VlcPlayer;

/**
 * Created by lixiaogang on 2018/3/30.
 * 实现了 MediaPlayer 接口的适配器类。
 */
public class MediaAdapter implements MediaPlayer{

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase("vls")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if (type.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("vls")) {
            advanceMediaPlayer.playVlc(fileName);
        } else if (type.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
