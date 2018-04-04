package top.lixiaogang.pattern.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lixiaogang on 2018/4/4.
 */
@Slf4j
public class ChatRoom {

    public static void showMessage(User user, String message) {
       log.info("name:{}, message:{}", user.getName(), message);
    }
}
