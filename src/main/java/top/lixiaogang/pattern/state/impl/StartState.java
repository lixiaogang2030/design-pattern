package top.lixiaogang.pattern.state.impl;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.state.Context;
import top.lixiaogang.pattern.state.State;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        log.info("in start action");
        context.setState(this);
    }
}
