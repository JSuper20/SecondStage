package com.damahou.day04.array;

import java.util.Arrays;

/**
 * @Program SecondStage
 * @ClassName BinarySearchDemo01
 * @Package com.damahou.day04.array
 * @Description 二分查找
 * @Author DaMaHou
 * @CreateDate 2023-07-09 16:45
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class BinarySearchDemo01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 二分查找前提是，数组必须有序
        Arrays.sort(arr);
        int num = 6;
        int index = binarySearch(arr, num);
        System.out.println(index);
    }

    /**
     * 二分查找
     *
     * @param arr arr
     * @param num num
     * @return index
     */
    private static int binarySearch(int[] arr, int num) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        while (minIndex <= maxIndex) {
            // int midIndex = (minIndex + maxIndex) / 2;
            int midIndex = (minIndex + maxIndex) >> 1;
            if (num > arr[midIndex]) {
                minIndex = midIndex + 1;
            } else if (num == arr[midIndex]) {
                return midIndex;
            } else {
                maxIndex = midIndex - 1;
            }
        }
        return -1;
    }
}
