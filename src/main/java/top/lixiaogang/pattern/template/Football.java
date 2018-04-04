package top.lixiaogang.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class Football extends Game {

    @Override
    void init() {
      log.info("Football init");
    }

    @Override
    void startPlay() {
        log.info("Football start");
    }

    @Override
    void endPlay() {
        log.info("Football end");
    }
}
