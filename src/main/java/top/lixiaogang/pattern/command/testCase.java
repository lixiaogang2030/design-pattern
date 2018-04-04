package top.lixiaogang.pattern.command;

import top.lixiaogang.pattern.command.impl.BuyStock;
import top.lixiaogang.pattern.command.impl.SellStock;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class testCase {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
