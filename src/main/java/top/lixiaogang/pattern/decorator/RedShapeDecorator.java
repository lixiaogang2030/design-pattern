package top.lixiaogang.pattern.decorator;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.decorator.impl.ShapeDecorator;

/**
 * Created by lixiaogang on 2018/4/3.
 */
@Slf4j
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        drawRed();
    }

    private void drawRed() {
        log.info("draw red");
    }
}
