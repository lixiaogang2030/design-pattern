package top.lixiaogang.pattern.nullobject;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}