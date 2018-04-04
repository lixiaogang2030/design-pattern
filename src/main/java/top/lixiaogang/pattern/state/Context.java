package top.lixiaogang.pattern.state;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
