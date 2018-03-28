package top.lixiaogang.pattern.abstractfactory;

/**
 * Created by lixiaogang on 2018/3/28.
 */
public class testCase {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape = shapeFactory.getShape("square");
        shape.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("red");
        color.fill();
    }
}
