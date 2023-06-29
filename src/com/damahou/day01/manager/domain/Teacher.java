package com.damahou.day01.manager.domain;

/**
 * @Program SecondStage
 * @ClassName Teacher
 * @Package com.damahou.day01.manager.dao
 * @Description Teacher
 * @Author DaMaHou
 * @CreateDate 2023-06-24 10:24
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String id, String name, String age, String birthday) {
        super(id, name, age, birthday);
    }
}
