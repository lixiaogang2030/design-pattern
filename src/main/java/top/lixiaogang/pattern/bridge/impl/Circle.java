package top.lixiaogang.pattern.bridge.impl;

import top.lixiaogang.pattern.bridge.DrawApi;
import top.lixiaogang.pattern.bridge.Shape;

/**
 * Created by lixiaogang on 2018/3/30.
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
