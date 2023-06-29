package com.damahou.day02.extend;

/**
 * @Program SecondStage
 * @ClassName Student
 * @Package com.damahou.day02.extend
 * @Description Student
 * @Author DaMaHou
 * @CreateDate 2023-06-29 22:42
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Student extends Person {
    private double score;

    public Student() {
        super();
        score = num + 0.0;
        System.out.println("子类的空参构造------------");
    }

    public Student(double score) {
        super();
        this.score = score;
        System.out.println("子类的带参构造==========");
    }

}
