package com.damahou.day04.array;

import java.util.Scanner;

/**
 * @Program SecondStage
 * @ClassName FactoryForSumDemo04
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 22:34
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FactoryForSumDemo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }

    /**
     * 递归 求阶乘
     *
     * @param num num
     * @return factorial
     */
    private static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
