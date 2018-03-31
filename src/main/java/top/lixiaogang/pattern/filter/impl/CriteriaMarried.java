package top.lixiaogang.pattern.filter.impl;

import top.lixiaogang.pattern.filter.Criteria;
import top.lixiaogang.pattern.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaogang on 2018/3/31.
 */
public class CriteriaMarried implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersions = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getStatus().equalsIgnoreCase("MARRIED")) {
                malePersions.add(person);
            }
        }
        return malePersions;
    }
}
