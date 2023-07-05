package com.damahou.day04.lambda;

/**
 * @Program SecondStage
 * @ClassName StringHandler
 * @Package com.damahou.day04.lambda
 * @Description Lambda 表达式练习
 * @Author DaMaHou
 * @CreateDate 2023-07-05 23:04
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class StringHandlerDemo {
    public static void main(String[] args) {
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String str) {
                System.out.println("匿名内部类：" + str);
            }
        });

        useStringHandler((String str) -> {
            System.out.println("Lambda表达式：" + str);
        });

        useStringHandler(str -> System.out.println("Lambda表达式简化后：" + str));

        useStringHandler(System.out::println);
    }

    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMessage("打印字符串");
    }
}

interface StringHandler {
    void printMessage(String str);
}
