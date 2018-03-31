package top.lixiaogang.pattern.filter.impl;

import top.lixiaogang.pattern.filter.Criteria;
import top.lixiaogang.pattern.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaogang on 2018/3/31.
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersions = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(firstCriteriaPersions);
    }
}
