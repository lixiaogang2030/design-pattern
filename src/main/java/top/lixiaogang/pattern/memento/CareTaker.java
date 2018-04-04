package top.lixiaogang.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class CareTaker {
    List<Memento> mementoList = new ArrayList<Memento>();

    public void add (Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
