package top.lixiaogang.pattern.filter;

import com.alibaba.fastjson.JSONObject;
import top.lixiaogang.pattern.filter.impl.AndCriteria;
import top.lixiaogang.pattern.filter.impl.CriteriaFemale;
import top.lixiaogang.pattern.filter.impl.CriteriaMale;
import top.lixiaogang.pattern.filter.impl.CriteriaMarried;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaogang on 2018/3/31.
 */
public class testCase {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria married = new CriteriaMarried();
        Criteria marriedMale = new AndCriteria(married, male);

        System.out.println("Males: " + JSONObject.toJSONString(male.meetCriteria(persons)));

        System.out.println("Females: " + JSONObject.toJSONString(female.meetCriteria(persons)));

        System.out.println("MarriedMales: " + JSONObject.toJSONString(marriedMale.meetCriteria(persons)));
    }
}
