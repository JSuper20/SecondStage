package com.damahou.day04.array;

import java.util.Arrays;

/**
 * @Program SecondStage
 * @ClassName BubbleSortDemo01
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 17:38
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class BubbleSortDemo01 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println("原数组：" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1 - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1 - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1 - 3; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
