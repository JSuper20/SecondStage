package com.damahou.day04.array;

import java.util.Scanner;

/**
 * @Program SecondStage
 * @ClassName FactoryForSumDemo03
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 18:53
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FactoryForSumDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = getNum(num);
        System.out.println(sum);
    }

    /**
     * 递归计算 0到给定的数到的和
     *
     * @param num num
     * @return sum
     */
    private static int getNum(int num) {
        if (num < 0) {
            if (num == -1) {
                return -1;
            } else {
                return num + getNum(num + 1);
            }
        } else if (num == 0) {
            return 0;
        } else {
            if (num == 1) {
                return 1;
            } else {
                return num + getNum(num - 1);
            }
        }
    }
}
