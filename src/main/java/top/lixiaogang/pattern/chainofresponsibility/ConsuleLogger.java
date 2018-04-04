package top.lixiaogang.pattern.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class ConsuleLogger extends AbstractLogger{

    public ConsuleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("consule logger message:{}", message);
    }
}
