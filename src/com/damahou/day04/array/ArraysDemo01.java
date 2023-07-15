package com.damahou.day04.array;

import java.util.Arrays;

/**
 * @Program SecondStage
 * @ClassName ArraysDemo01
 * @Package com.damahou.day04.array
 * @Description Arrays工具类
 * @Author DaMaHou
 * @CreateDate 2023-07-15 15:05
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ArraysDemo01 {
    public static void main(String[] args) {
        /*
         * public static String toString(int[] a)	返回指定数组的内容的字符串表示形式
         * public static void sort(int[] a)	按照数字顺序排列指定的数组
         * public static int binarySearch(int[] a, int key)	利用二分查找返回指定元素的索引
         */

        int arr[] = {3, 2, 5, 4, 7, 6, 9};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i = Arrays.binarySearch(arr, 7);
        System.out.println("7 的索引是：" + i);
        //1,数组必须有序
        //2.如果要查找的元素存在,那么返回的是这个元素实际的索引
        //3.如果要查找的元素不存在,那么返回的是 (-插入点-1)
        //插入点:如果这个元素在数组中,他应该在哪个索引上
        int j = Arrays.binarySearch(arr, 10);
        System.out.println("10 的索引是：" + j);

        int k = Arrays.binarySearch(arr, 0);
        System.out.println("0 的索引是：" + k);

    }
}
