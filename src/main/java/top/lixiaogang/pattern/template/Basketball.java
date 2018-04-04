package top.lixiaogang.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class Basketball extends Game {

    @Override
    void init() {
      log.info("Basketball init");
    }

    @Override
    void startPlay() {
        log.info("Basketball start");
    }

    @Override
    void endPlay() {
        log.info("Basketball end");
    }
}
