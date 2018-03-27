package top.lixiaogang.pattern.factory;

import lombok.extern.slf4j.Slf4j;
import top.lixiaogang.pattern.factory.impl.Rectangle;
import top.lixiaogang.pattern.factory.impl.Square;

/**
 * Created by xiaogangli on 2018/3/27.
 */
@Slf4j
public class DrawFactory {

    public Shape getShape(String name) {

        if (name == null) {
            return null;
        }

        if (name.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        if (name.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;

    }
}
