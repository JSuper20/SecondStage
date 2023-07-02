package com.damahou.day03.inters.complicate;

/**
 * @Program SecondStage
 * @ClassName InterA
 * @Package com.damahou.day03.inters.complicate
 * @Description InterA
 * @Author DaMaHou
 * @CreateDate 2023-07-02 16:53
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public interface InterA {

    public abstract void methodA();

    public default void show() {
        System.out.println("InterA default method: show");
    }
}
