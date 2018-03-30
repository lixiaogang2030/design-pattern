package top.lixiaogang.pattern.builder;

/**
 * Created by lixiaogang on 2018/3/
 * 使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 */
public class testCase {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.getVegBurger();
        meal.showItems();
        System.out.println(meal.getCost());
    }
}
