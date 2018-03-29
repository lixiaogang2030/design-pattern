package top.lixiaogang.pattern.builder;

import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaogang on 2018/3/29.
 */
public class Meal {
    private List<Item> itemList = new ArrayList<Item>();

    protected void addItem(Item item) {
        itemList.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : itemList) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.pack().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
