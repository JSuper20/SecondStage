package com.damahou.day03.polymorphism.demo02;

/**
 * @Program SecondStage
 * @ClassName Zi
 * @Package com.damahou.day03.polymorphism.demo02
 * @Description Zi
 * @Author DaMaHou
 * @CreateDate 2023-07-02 17:37
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Zi extends Fu {
    int num = 20;

    @Override
    public void method() {
        System.out.println("Zi …… method");
    }

    public void show() {
        System.out.println("Zi show ……");
    }
}
