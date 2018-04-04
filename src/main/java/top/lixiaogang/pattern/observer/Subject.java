package top.lixiaogang.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObserver(){
        observers.stream().forEach(observer -> {
            observer.update();
        });
    }
}
