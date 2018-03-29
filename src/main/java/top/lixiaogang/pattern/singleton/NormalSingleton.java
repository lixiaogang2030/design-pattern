package top.lixiaogang.pattern.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/3/28.
 * 非懒加载，线程安全-基于classloader机制
 */
@Slf4j
public class NormalSingleton {
    private static NormalSingleton singleton = new NormalSingleton();

    /**
     * 构造函数是私有的，这样该类就不可以实例化
     */
    private NormalSingleton() {

    }

    public static NormalSingleton getSingleton() {
        return singleton;
    }

    public void doSomething() {
        log.info("singleton:" + singleton.hashCode());
    }
}
