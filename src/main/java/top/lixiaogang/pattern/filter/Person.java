package top.lixiaogang.pattern.filter;

import top.lixiaogang.pattern.builder.Packing;

/**
 * Created by lixiaogang on 2018/3/31.
 */
public class Person {
    private String name;
    private String gender;
    private String status;

    public Person(String name, String gender, String status) {
        this.name = name;
        this.gender = gender;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
