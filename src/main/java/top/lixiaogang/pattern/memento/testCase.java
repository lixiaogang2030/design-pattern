package top.lixiaogang.pattern.memento;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class testCase {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        log.info("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        log.info("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        log.info("Second saved State: " + originator.getState());
    }
}
