package com.damahou.day04.lambda;

/**
 * @Program SecondStage
 * @ClassName FlyabelDemo
 * @Package com.damahou.day04.lambda
 * @Description Lambda 表达式练习
 * @Author DaMaHou
 * @CreateDate 2023-07-05 22:18
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FlyabelDemo {
    public static void main(String[] args) {
        // 匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String str) {
                System.out.println(str);
                System.out.println("乘飞机看空中美景");
            }
        });

        // Lambda 表达式
        useFlyable((String str) -> {
            System.out.println(str);
            System.out.println("飞机自驾游");
        });

        // 简化
        useFlyable(str ->
        {
            System.out.println(str);
            System.out.println("hhhhhhhhhhhhhhhh");
        });

        useFlyable(str -> System.out.println(str));


        useFlyable(System.out::println);
    }

    public static void useFlyable(Flyable flyable) {
        flyable.fly("风和日丽，晴空万里");
    }
}

interface Flyable {
    void fly(String str);
}