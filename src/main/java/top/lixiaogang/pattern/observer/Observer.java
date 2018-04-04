package top.lixiaogang.pattern.observer;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
