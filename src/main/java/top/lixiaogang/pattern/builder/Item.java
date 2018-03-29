package top.lixiaogang.pattern.builder;

/**
 * Created by lixiaogang on 2018/3/29.
 * 食品条目和包装的接口
 */
public interface Item {
    String name();
    Packing pack();
    float price();
}
