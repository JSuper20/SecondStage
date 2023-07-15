package com.damahou.day04.integer;

import java.util.Objects;

/**
 * @Program SecondStage
 * @ClassName IntegerDemo03
 * @Package com.damahou.day04.integer
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 16:24
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class IntegerDemo03 {
    public static void main(String[] args) {
        /*
         * int 类型与 String 类型的相互转换
         */

        // int 转 String
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1);
        String s2 = String.valueOf(i1);
        System.out.println(s2);

        // String 转 int
        String s3 = "300";
        int i3 = Integer.parseInt(s3);
        System.out.println(i3);

        Integer i4 = Integer.valueOf(s3);
        int i5 = i4.intValue();
        System.out.println(i5);

        // 需注意：在进行类转换的时候，需要对对象进行判空处理
        // java.lang.NumberFormatException: Cannot parse null string
        s3 = null;
        if (Objects.nonNull(s3)) {
            int i6 = Integer.parseInt(s3);
            System.out.println(i6);
        }
    }
}
