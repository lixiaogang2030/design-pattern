package top.lixiaogang.pattern.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        log.info("OctalObserver update state:{}", subject.getState());
    }
}
