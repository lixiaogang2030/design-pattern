package top.lixiaogang.pattern.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/3/29.
 * 是用于创建重复的对象，同时又能保证性能。
 * 先创建一个实现了Clonable接口的抽象类。
 */
@Slf4j
public abstract class Shape implements Cloneable{

    private String id;
    private String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (Exception e) {
            log.error("clone error", e);
        }
        return clone;
    }
}
