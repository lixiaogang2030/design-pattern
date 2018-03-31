package top.lixiaogang.pattern.filter;

import java.util.List;

/**
 * Created by lixiaogang on 2018/3/31.
 * 为条件创建一个接口
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> personList);
}
