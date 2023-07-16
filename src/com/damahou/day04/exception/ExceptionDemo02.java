package com.damahou.day04.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Program SecondStage
 * @ClassName ExceptionDemo02
 * @Package com.damahou.day04.exception
 * @Description Exception练习
 * @Author DaMaHou
 * @CreateDate 2023-07-16 11:01
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ExceptionDemo02 {
    public static void main(String[] args) throws ParseException {
       /* int[] arr = {1, 2, 3, 4};
        // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
        System.out.println(arr[10]);*/

        /*String str = null;
        // java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
        System.out.println(str.equals("hhhh"));*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // java.text.ParseException: Unparseable date: "2023年07-16"
        Date date = sdf.parse("2023年07-16");
        System.out.println(date);

    }
}
