package com.damahou.day03.polymorphism.demo03;

/**
 * @Program SecondStage
 * @ClassName Cat
 * @Package com.damahou.day03.polymorphism.demo03
 * @Description Cat
 * @Author DaMaHou
 * @CreateDate 2023-07-02 23:16
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
