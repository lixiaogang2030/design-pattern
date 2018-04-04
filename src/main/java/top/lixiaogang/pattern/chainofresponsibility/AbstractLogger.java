package top.lixiaogang.pattern.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    // 责任链的下一个元素
    protected AbstractLogger next;

    public void setNext(AbstractLogger logger) {
        this.next = logger;
    }

    public void logMessage(int level, String message) {
        log.info("this.level:{}, level:{}", this.level, level);
        if (this.level <= level) {
            write (message);
        }

        if (next != null) {
            next.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
