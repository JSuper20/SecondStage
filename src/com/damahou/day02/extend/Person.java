package com.damahou.day02.extend;

/**
 * @Program SecondStage
 * @ClassName Person
 * @Package com.damahou.day02.extend
 * @Description Person
 * @Author DaMaHou
 * @CreateDate 2023-06-29 22:39
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;
    int num;

    /**
     * 空参构造
     */
    public Person() {
        /*
         * 类都直接或者间接的继承自Object类
         * 构造方法用于给成员变量赋值
         * super(); 只能放在构造方法的逻辑第一行；且不能与 this(); 共存
         * this(); 表示调用本类的空参构造
         */
        super();
        System.out.println("父类空参构造");
    }

    /**
     * 带参构造
     *
     * @param name name
     */
    public Person(String name) {
        super();
        this.name = name;
        System.out.println("父类带参构造");
    }
}
