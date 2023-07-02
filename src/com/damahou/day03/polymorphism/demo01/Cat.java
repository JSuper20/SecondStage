package com.damahou.day03.polymorphism.demo01;

/**
 * @Program SecondStage
 * @ClassName Cat
 * @Package com.damahou.day03.polymorphism.demo01
 * @Description Cat
 * @Author DaMaHou
 * @CreateDate 2023-07-02 17:32
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }
}
