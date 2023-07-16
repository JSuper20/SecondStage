package com.damahou.day04.exception;

/**
 * @Program SecondStage
 * @ClassName Student
 * @Package com.damahou.day04.exception
 * @Description Student
 * @Author DaMaHou
 * @CreateDate 2023-07-16 12:37
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        if (age >= 18 && age <= 25) {
            this.age = age;
        } else {
            // throw new RuntimeException("年龄超出限制");
            throw new AgeOutOfBoundsException("年龄超出限制");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 25) {
            this.age = age;
        } else {
            // throw new RuntimeException("年龄超出限制");
            throw new AgeOutOfBoundsException("年龄超出限制");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
