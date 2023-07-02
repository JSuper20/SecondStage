package com.damahou.day03;

/**
 * @Program SecondStage
 * @ClassName Animal
 * @Package com.damahou.day03
 * @Description Animal
 * @Author DaMaHou
 * @CreateDate 2023-07-02 8:48
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public abstract class Animal {
    /**
     * abstract method
     * eat method
     */
    public abstract void eat();

    /**
     * common method
     * drink
     */
    public void drink() {
        System.out.println("喝水");
    }
}
