package com.damahou.day03.polymorphism.demo03;

/**
 * @Program SecondStage
 * @ClassName Dog
 * @Package com.damahou.day03.polymorphism.demo03
 * @Description Dog
 * @Author DaMaHou
 * @CreateDate 2023-07-02 23:17
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    public void watchHome() {
        System.out.println("狗看家");
    }
}
