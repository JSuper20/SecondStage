package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName InterB
 * @Package com.damahou.day03
 * @Description InterB
 * @Author DaMaHou
 * @CreateDate 2023-07-02 13:48
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public interface InterB {

    public default void show() {
        System.out.println("B接口中的show方法");
    }

    public static void display() {
        System.out.println("display方法");
    }
}
