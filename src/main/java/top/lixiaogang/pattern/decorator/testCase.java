package top.lixiaogang.pattern.decorator;

import top.lixiaogang.pattern.decorator.impl.Square;

/**
 * Created by lixiaogang on 2018/4/3.
 */
public class testCase {

    public static void main(String[] args) {
        Shape shape = new RedShapeDecorator(new Square());
        shape.draw();
    }
}
