package top.lixiaogang.pattern.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/3/29.
 * 懒加载，线程安全。采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInsurance()的性能对整个程序很关键
 */
@Slf4j
public class Singleton3 {
    private volatile static Singleton3 instance;
    private Singleton3() {

    }
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }

        }
        return instance;
    }

}
