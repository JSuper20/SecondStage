package com.damahou.day04.array;

/**
 * @Program SecondStage
 * @ClassName FactoryForSumDemo02
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 18:48
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FactoryForSumDemo02 {
    public static void main(String[] args) {
        int i = 10;
        int sum = getSum(i);
        System.out.println(sum);
    }

    /**
     * 递归 求和
     *
     * @param i i
     * @return sum
     */
    private static int getSum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + getSum(i - 1);
        }
    }
}
