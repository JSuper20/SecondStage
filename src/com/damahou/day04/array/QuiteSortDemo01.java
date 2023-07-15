package com.damahou.day04.array;

import java.util.Arrays;

/**
 * @Program SecondStage
 * @ClassName QuiteSortDemo01
 * @Package com.damahou.day04.array
 * @Description quiteSort
 * @Author DaMaHou
 * @CreateDate 2023-07-15 14:17
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class QuiteSortDemo01 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        // 递归结束条件
        if (left > right) {
            return;
        }

        // 基准数
        int baseNum = arr[left];
        int left0 = left;
        int right0 = right;

        while (left != right) {
            // 从右边开始找比基准数小的
            while (arr[right] >= baseNum && right > left) {
                right--;
            }
            // 从左边开始找比基数大的
            while (arr[left] <= baseNum && right > left) {
                left++;
            }
            // 交换两个值的位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        // 基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        // 递归调用自己，将左边排好
        quickSort(arr, left0, left -1);
        // 递归调用自己，将右边排好
        quickSort(arr, left +1, right0);
    }
}
