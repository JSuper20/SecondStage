package com.damahou.day04.lambda;

/**
 * @Program SecondStage
 * @ClassName CalculatorHandlerDemo
 * @Package com.damahou.day04.lambda
 * @Description Lambda 表达式练习
 * @Author DaMaHou
 * @CreateDate 2023-07-05 23:26
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class CalculatorHandlerDemo {
    public static void main(String[] args) {
        useCalculatorHandler(new CalculatorHandler() {
            @Override
            public int calc(int x, int y) {
                System.out.println("x = " + x + ", y = " + y + " 之和为：");
                return x + y;
            }
        });

        useCalculatorHandler((int x, int y) -> {
            return x + y;
        });

        useCalculatorHandler((x, y) -> {
            return x + y;
        });

        useCalculatorHandler((x, y) -> x + y);

        useCalculatorHandler(Integer::sum);
    }

    public static void useCalculatorHandler(CalculatorHandler calculatorHandler) {
        int calc = calculatorHandler.calc(20, 30);
        System.out.println("calc = " + calc);
    }
}

interface CalculatorHandler {
    int calc(int x, int y);
}
