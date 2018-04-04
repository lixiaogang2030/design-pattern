package top.lixiaogang.pattern.nullobject;

import java.util.Arrays;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class CustomerFactory {

    public static final String[] names = {"lxg", "wyf", "cza"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
