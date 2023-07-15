package com.damahou.day04.array;

import java.util.Scanner;

/**
 * @Program SecondStage
 * @ClassName FactoryDemo06
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 22:54
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FactoryDemo06 {
    public static void main(String[] args) {
        // 有N阶台阶，上楼可以一次上一阶，也可以一次上二阶，计算共有多少种不同的走法
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        /*
         * 1    1
         * 2    2
         * 3    3
         * 4    5
         * 5    8
         */
        int result = getNext(num);
        System.out.println(result);
    }

    /**
     * 递归
     *
     * @param num num
     * @return int
     */
    private static int getNext(int num) {
        if (num <= 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return num;
        } else {
            return getNext(num - 1) + getNext(num - 2);
        }
    }
}
