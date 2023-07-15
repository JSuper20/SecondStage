package com.damahou.day04.array;

import java.util.Arrays;

/**
 * @Program SecondStage
 * @ClassName BubbleSortDemo02
 * @Package com.damahou.day04.array
 * @Description 冒泡排序
 * @Author DaMaHou
 * @CreateDate 2023-07-09 17:03
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class BubbleSortDemo02 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(arr));
        // 外层循环控制循环次数
        // -1 是因为 n 个数，只需要比较 n-1次即可
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环是实际比较
            // -1 是为了防止数组越界
            // -i 是因为每次循环比较次数会因循环的次数而减少
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
