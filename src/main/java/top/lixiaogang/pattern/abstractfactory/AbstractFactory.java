package top.lixiaogang.pattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/3/28.
 */
@Slf4j
public abstract class AbstractFactory {

    public abstract Shape getShape(String name);
    public abstract Color getColor(String color);

}
