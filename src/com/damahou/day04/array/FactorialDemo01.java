package com.damahou.day04.array;

/**
 * @Program SecondStage
 * @ClassName FactorialDemo01
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 17:51
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FactorialDemo01 {
    public static void main(String[] args) {
        int i = 10;
        int sum = factorial(i);
        System.out.println(sum);
    }

    /**
     * 递归累加
     *
     * @param i i
     * @return sum
     */
    private static int factorial(int i) {
        if (i == 1) {
            return i;
        } else {
            return i + factorial(i - 1);
        }
    }
}
