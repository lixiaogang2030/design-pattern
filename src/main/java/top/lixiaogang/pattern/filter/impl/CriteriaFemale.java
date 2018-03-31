package top.lixiaogang.pattern.filter.impl;

import top.lixiaogang.pattern.filter.Criteria;
import top.lixiaogang.pattern.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaogang on 2018/3/31.
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersions = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersions.add(person);
            }
        }
        return femalePersions;
    }
}
