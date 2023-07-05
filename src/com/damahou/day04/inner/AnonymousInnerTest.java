package com.damahou.day04.inner;

/**
 * @Program SecondStage
 * @ClassName AnonymousInnerTest
 * @Package com.damahou.day04.inner
 * @Description 匿名内部类
 * @Author DaMaHou
 * @CreateDate 2023-07-05 21:43
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class AnonymousInnerTest {
    public static void main(String[] args) {
        new Inner() {
            @Override
            public void method() {
                System.out.println("6666666");
            }
        }.method();

        Inner in = new Inner() {
            @Override
            public void method() {
                System.out.println("1111111111");
            }
        };
        in.method();
    }
}

interface Inner {
    void method();
}


