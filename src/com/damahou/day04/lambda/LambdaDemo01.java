package com.damahou.day04.lambda;

/**
 * @Program SecondStage
 * @ClassName LambdaDemo01
 * @Package com.damahou.day04.lambda
 * @Description Lambda表达式
 * @Author DaMaHou
 * @CreateDate 2023-07-05 22:02
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class LambdaDemo01 {
    public static void main(String[] args) {
        goSwimming(new Swimmings() {
            @Override
            public void swim() {
                System.out.println("天气好热，走耍水去");
            }
        });

        // 用Lambda实现
        goSwimming(() -> {
            System.out.println("走，游泳搞起");
        });
    }

    public static void goSwimming(Swimmings swimmings) {
        swimmings.swim();
    }
}

interface Swimmings {
    void swim();
}
