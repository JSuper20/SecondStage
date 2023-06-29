package com.damahou.day02.permission.test01;

/**
 * @Program SecondStage
 * @ClassName Fu
 * @Package com.damahou.day02.permission.test01
 * @Description Fu
 * @Author DaMaHou
 * @CreateDate 2023-06-25 23:34
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Fu {
    private String name;
    private int age;

    private void eat() {
        System.out.println("eat ~~~ ");
    }

    void walk() {
        System.out.println("walk ~~~ ");
    }

    protected void sleep() {
        System.out.println("sleep ~~~ ");
    }

    public void speak() {
        System.out.println("speak **** ");
    }
}
