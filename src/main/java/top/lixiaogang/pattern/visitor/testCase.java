package top.lixiaogang.pattern.visitor;

import top.lixiaogang.pattern.visitor.impl.Computer;
import top.lixiaogang.pattern.visitor.impl.ComputerPartDisplayVistor;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class testCase {

    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVistor());
    }
}
