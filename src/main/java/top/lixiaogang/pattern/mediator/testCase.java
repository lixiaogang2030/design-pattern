package top.lixiaogang.pattern.mediator;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class testCase {

    public static void main(String[] args) {
        User r = new User("r");
        User j = new User("j");

        r.sendMessage("hi");
        j.sendMessage("he");
    }
}
