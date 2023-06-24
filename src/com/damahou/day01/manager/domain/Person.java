package com.damahou.day01.manager.domain;

/**
 * @Program SecondStage
 * @ClassName Teacher
 * @Package com.damahou.day01.manager.domain
 * @Description Person
 * @Author DaMaHou
 * @CreateDate 2023-06-18 23:39
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Person {
    /**
     * 学号
     */
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private String age;
    /**
     * 出生日期
     */
    private String birthday;

    public Person() {
    }

    public Person(String id, String name, String age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
