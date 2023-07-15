package com.damahou.day04.array;

/**
 * @Program SecondStage
 * @ClassName FactoryForSumDemo01
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 18:44
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FactoryForSumDemo01 {
    public static void main(String[] args) {
        int i = 10;
        int sum = getNum(i);
        System.out.println("sum = " + sum);
    }

    /**
     * 递归求 n个2相加
     *
     * @param i i
     * @return sum
     */
    private static int getNum(int i) {
        if (i == 1) {
            return 2;
        } else {
            return 2 + getNum(i - 1);
        }
    }
}
