package top.lixiaogang.pattern.abstractfactory;

import javafx.scene.shape.Circle;
import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.abstractfactory.impl.Rectangle;
import top.lixiaogang.pattern.abstractfactory.impl.Square;

/**
 * Created by lixiaogang on 2018/3/28.
 */
@Slf4j
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String name) {
        if(name == null){
            return null;
        }
        if(name.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if(name.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
