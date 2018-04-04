package top.lixiaogang.pattern.flyweight;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.flyweight.impl.Circle;

import java.util.HashMap;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("create");
        }
        return circle;
    }
}
