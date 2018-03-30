package top.lixiaogang.pattern.prototype;

import javafx.scene.shape.Circle;

import java.util.Hashtable;

/**
 * Created by lixiaogang on 2018/3/30.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * 可以对每种形状进行数据库查询，并创建该形状
     * 下面就是举个例子
     */
    public static void loadCache() {
        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
