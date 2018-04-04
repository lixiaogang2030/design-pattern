package top.lixiaogang.pattern.decorator.impl;

import top.lixiaogang.pattern.decorator.Shape;

/**
 * Created by lixiaogang on 2018/4/3.
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape shape) {
        this.decoratorShape = shape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }

}
