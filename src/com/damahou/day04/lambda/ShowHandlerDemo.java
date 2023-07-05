package com.damahou.day04.lambda;

/**
 * @Program SecondStage
 * @ClassName ShowHandlerDemo
 * @Package com.damahou.day04.lambda
 * @Description Lambda 表达式练习
 * @Author DaMaHou
 * @CreateDate 2023-07-05 22:46
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ShowHandlerDemo {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("打印一句话");
            }
        });

        useShowHandler(() -> System.out.println("李玟因抑郁症自杀，不治离世"));
    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }
}

interface ShowHandler {
    void show();
}
