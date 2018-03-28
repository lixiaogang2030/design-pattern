package top.lixiaogang.pattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/3/28.
 */
@Slf4j
public class FactoryProducer {
    public static AbstractFactory getFactory(String name) {
        if(name.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        if(name.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
