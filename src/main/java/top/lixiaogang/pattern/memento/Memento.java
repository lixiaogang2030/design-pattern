package top.lixiaogang.pattern.memento;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class Memento {

    private String state;

    public Memento (String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
