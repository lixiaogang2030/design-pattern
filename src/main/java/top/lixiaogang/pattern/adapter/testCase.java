package top.lixiaogang.pattern.adapter;

import top.lixiaogang.pattern.adapter.impl.AudioPlayer;

/**
 * Created by lixiaogang on 2018/3/30.
 */
public class testCase {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("vls" , "m1");
        player.play("mp4" , "m2");
    }
}
