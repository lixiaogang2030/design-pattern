package top.lixiaogang.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaogang on 2018/4/4.
 * 命令调用类
 */
public class Broker {
    private List<Order> orders =  new ArrayList<Order>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        orders.stream().forEach(v -> {
            v.execute();
        });
        orders.clear();
    }
}
