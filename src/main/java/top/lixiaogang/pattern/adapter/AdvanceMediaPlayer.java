package top.lixiaogang.pattern.adapter;

/**
 * Created by lixiaogang on 2018/3/30.
 * 为高级媒体播放器创建接口。
 */
public interface AdvanceMediaPlayer {
    void playVlc (String fileName);
    void playMp4 (String fileName);
}
