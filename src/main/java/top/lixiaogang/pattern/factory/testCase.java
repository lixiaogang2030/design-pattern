package top.lixiaogang.pattern.factory;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lixiaogang on 2018/3/27.
 */
public class testCase {

    public static void main(String[] args) {
        DrawFactory drawFactory = new DrawFactory();
        Shape shape1 = drawFactory.getShape("Rectangle");
        Shape shape2 = drawFactory.getShape("Square");
        shape1.draw();
        shape2.draw();
    }

}
