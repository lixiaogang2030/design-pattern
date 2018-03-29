package top.lixiaogang.pattern.singleton;

/**
 * Created by lixiaogang on 2018/3/28.
 */
public class testCase {

    public static void main(String[] args) {
        //NormalSingleton singleton = new NormalSingleton(); 报错
        NormalSingleton singleton = NormalSingleton.getSingleton();
        NormalSingleton singleton1 = NormalSingleton.getSingleton();
        NormalSingleton singleton2 = NormalSingleton.getSingleton();
        NormalSingleton singleton3 = NormalSingleton.getSingleton();
        NormalSingleton singleton4 = NormalSingleton.getSingleton();
        singleton.doSomething();
        singleton1.doSomething();
        singleton2.doSomething();
        singleton3.doSomething();
        singleton4.doSomething();
    }
}
