package top.lixiaogang.pattern.bridge;

/**
 * Created by lixiaogang on 2018/3/30.
 * 用 DrawAPI 接口创建抽象类 Shape。
 */
public abstract class Shape {

    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }
    public abstract void draw();

}
