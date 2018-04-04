package top.lixiaogang.pattern.nullobject;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class testCase {

    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("cza");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("bbb");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("aaa");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("wyf");

        log.info("Customers");
        log.info(customer1.getName());
        log.info(customer2.getName());
        log.info(customer3.getName());
        log.info(customer4.getName());
    }
}
