package com.damahou.day04.array;

import java.util.Arrays;

/**
 * @Program SecondStage
 * @ClassName StringArrayDemo01
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 16:33
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class StringArrayDemo01 {
    public static void main(String[] args) {
        // 有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：27 38 46 50 91
        String str = "91 27 46 38 50";
        System.out.println(str);
        String[] s = str.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
