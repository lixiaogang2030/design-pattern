package top.lixiaogang.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaogang on 2018/4/2.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> sub;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        sub = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        sub.add(e);
    }

    public void remove(Employee e) {
        sub.remove(e);
    }

    public List<Employee> getSub() {
        return sub;
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
