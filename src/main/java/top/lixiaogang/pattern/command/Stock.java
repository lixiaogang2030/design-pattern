package top.lixiaogang.pattern.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/4/4.
 * 请求类
 */
@Slf4j
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        log.info("buy,name:{},quantity:{}", name, quantity);
    }

    public void sell() {
        log.info("sell,name:{},quantity:{}", name, quantity);
    }
}
