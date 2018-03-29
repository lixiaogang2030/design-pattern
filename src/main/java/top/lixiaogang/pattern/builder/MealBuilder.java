package top.lixiaogang.pattern.builder;

/**
 * Created by lixiaogang on 2018/3/29.
 */
public class MealBuilder {
    public Meal getVegBurger() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal getNonVegMeal() {
        return null;
    }
}
