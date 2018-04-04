package top.lixiaogang.pattern.template;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public abstract class Game {
    abstract void init();
    abstract void startPlay();
    abstract void endPlay();

    // 模板
    public final void play() {
        init();
        startPlay();
        endPlay();
    }
}
