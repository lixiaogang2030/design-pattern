package top.lixiaogang.pattern.bridge;

import top.lixiaogang.pattern.bridge.impl.Circle;
import top.lixiaogang.pattern.bridge.impl.GreenCircle;
import top.lixiaogang.pattern.bridge.impl.RedCircle;

/**
 * Created by lixiaogang on 2018/3/31.
 */
public class testCase {

    public static void main(String[] args) {
        Shape red = new Circle(100, 200, 10, new RedCircle());
        Shape green = new Circle(100, 200, 15, new GreenCircle());

        red.draw();
        green.draw();
    }
}
