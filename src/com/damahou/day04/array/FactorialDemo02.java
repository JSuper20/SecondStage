package com.damahou.day04.array;

/**
 * @Program SecondStage
 * @ClassName FactorialDemo02
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 17:58
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FactorialDemo02 {
    public static void main(String[] args) {
        int i = 5;
        int sum = mul(i);
        System.out.println(sum);
    }

    /**
     * 递归求阶乘
     *
     * @param i i
     * @return 积
     */
    private static int mul(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * mul(i - 1);
        }
    }
}
