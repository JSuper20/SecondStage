package com.damahou.day03.abstractTest;

/**
 * @Program SecondStage
 * @ClassName Cat
 * @Package com.damahou.day03
 * @Description Cat
 * @Author DaMaHou
 * @CreateDate 2023-07-02 8:50
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Cat extends Animal {
    /**
     * eat method
     */
    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }
}
