package top.lixiaogang.pattern.proxy;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class testCase {

    public static void main(String[] args) {
        Image image = new ProxyImage("abc.jpg");
        image.disPlay();
    }
}
