package top.lixiaogang.pattern.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/3/29.
 * 懒加载，线程安全
 */
@Slf4j
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2() {

    }
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

}
