package top.lixiaogang.pattern.command.impl;

import top.lixiaogang.pattern.command.Order;
import top.lixiaogang.pattern.command.Stock;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
