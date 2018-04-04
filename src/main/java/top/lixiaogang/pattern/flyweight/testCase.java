package top.lixiaogang.pattern.flyweight;

import top.lixiaogang.pattern.flyweight.impl.Circle;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class testCase {

    public static void main(String[] args) {
        Circle circle = (Circle)ShapeFactory.getCircle("red");
        circle.draw();
        Circle circle1 = (Circle)ShapeFactory.getCircle("red");
        circle1.draw();
        Circle circle2 = (Circle)ShapeFactory.getCircle("green");
        circle2.draw();
    }
}
