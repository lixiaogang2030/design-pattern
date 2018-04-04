package top.lixiaogang.pattern.state;

import top.lixiaogang.pattern.state.impl.StartState;
import top.lixiaogang.pattern.state.impl.StopState;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class testCase {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        StopState stopState = new StopState();
        stopState.doAction(context);
    }
}
