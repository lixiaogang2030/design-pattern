package top.lixiaogang.pattern.template;

/**
 * Created by lixiaogang on 2018/4/4.
 */
public class testCase {

    public static void main (String[] args) {
        Game game = new Football();
        game.play();
        Game bgame = new Basketball();
        bgame.play();
    }
}
