package com.damahou.day04.array;

import java.util.Scanner;

/**
 * @Program SecondStage
 * @ClassName FactoryDemo05
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 22:42
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FactoryDemo05 {
    public static void main(String[] args) {
        // 已知：数列1,1,2,4,7,13,24,44,...求数列的第 n项
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = getNext(num);
        System.out.println(result);
    }

    /**
     * 递归获取第n项值
     *
     * @param num num
     * @return int
     */
    private static int getNext(int num) {
        if (num <= 0) {
            return 0;
        } else {
            if (num == 1) {
                return 1;
            } else if (num == 2) {
                return 1;
            } else if (num == 3) {
                return 2;
            } else {
                return getNext(num - 1) + getNext(num - 2) + getNext(num - 3);
            }
        }
    }
}
