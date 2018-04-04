package top.lixiaogang.pattern.facade;

import top.lixiaogang.pattern.facade.impl.Rectangle;
import top.lixiaogang.pattern.facade.impl.Square;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class ShapeMarker {
    private Shape rectangle;
    private Shape square;

    public ShapeMarker() {
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
