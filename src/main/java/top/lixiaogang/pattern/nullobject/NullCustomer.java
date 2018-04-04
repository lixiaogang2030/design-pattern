package top.lixiaogang.pattern.nullobject;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "NULL";
    }
}