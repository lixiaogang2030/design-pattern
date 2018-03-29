package top.lixiaogang.pattern.builder;

/**
 * Created by lixiaogang on 2018/3/29.
 */
public class testCase {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.getVegBurger();
        meal.showItems();
        System.out.println(meal.getCost());
    }
}
