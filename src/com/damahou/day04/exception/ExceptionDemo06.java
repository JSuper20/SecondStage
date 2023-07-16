package com.damahou.day04.exception;

/**
 * @Program SecondStage
 * @ClassName ExceptionDemo06
 * @Package com.damahou.day04.exception
 * @Description Exception
 * @Author DaMaHou
 * @CreateDate 2023-07-16 11:38
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ExceptionDemo06 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4};
        int[] arr = null;
        try {
            paintArr(arr);
        } catch (Exception e) {
            System.out.println("这里出现了异常");
            e.printStackTrace();
        }
        System.out.println("6666666");
    }

    private static void paintArr(int[] arr) {
        if (arr == null) {
            // System.out.println("数组不能为null");
            throw new NullPointerException();
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
