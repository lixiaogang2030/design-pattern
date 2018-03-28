package top.lixiaogang.pattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.abstractfactory.impl.Green;
import top.lixiaogang.pattern.abstractfactory.impl.Rectangle;
import top.lixiaogang.pattern.abstractfactory.impl.Red;
import top.lixiaogang.pattern.abstractfactory.impl.Square;

/**
 * Created by lixiaogang on 2018/3/28.
 */
@Slf4j
public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String name) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }
        if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }
}
