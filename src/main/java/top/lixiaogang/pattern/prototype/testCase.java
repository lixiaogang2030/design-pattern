package top.lixiaogang.pattern.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/3/30.
 */
@Slf4j
public class testCase {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape = (Shape) ShapeCache.getShape("1");
        log.info("shape:{}", shape.getType());

        Shape shape1 = (Shape) ShapeCache.getShape("2");
        log.info("shape:{}", shape1.getType());
    }
}
