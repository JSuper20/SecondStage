package com.damahou.day04.lambda;

import java.util.Random;

/**
 * @Program SecondStage
 * @ClassName RandomNumHandlerDemo
 * @Package com.damahou.day04.lambda
 * @Description Lambda 表达式练习
 * @Author DaMaHou
 * @CreateDate 2023-07-05 23:13
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class RandomNumHandlerDemo {
    public static void main(String[] args) {
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getRandomNum() {
                int nextInt = new Random().nextInt(10) + 1;
                return nextInt;
            }
        });

        useRandomNumHandler(() -> {
            return new Random().nextInt(10) + 1;
        });

        useRandomNumHandler(() -> new Random().nextInt(10) + 1);
    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        int randomNum = randomNumHandler.getRandomNum();
        System.out.println("randomNum = " + randomNum);
    }
}

interface RandomNumHandler {
    int getRandomNum();
}
