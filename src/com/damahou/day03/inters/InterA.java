package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName InterA
 * @Package com.damahou.day03
 * @Description InterA
 * @Author DaMaHou
 * @CreateDate 2023-07-02 13:44
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public interface InterA {

    // jdk 8 之后接口中可以定义默认方法
    public default void show() {
        System.out.println("A 接口中的 show");
    }

    // 静态方法属于接口，通过实现类无法调用
    public static void display() {
        System.out.println("display方法");
    }
}
