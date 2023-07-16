package com.damahou.day04.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Program SecondStage
 * @ClassName ExceptionDemo01
 * @Package com.damahou.day04.exception
 * @Description Exception练习
 * @Author DaMaHou
 * @CreateDate 2023-07-16 10:35
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ExceptionDemo01 {
    public static void main(String[] args) throws ParseException {
        System.out.println("start");
        // arrayPrint();

        dateTimeFormat();

        System.out.println("end");
    }

    private static void dateTimeFormat() throws ParseException {
        String dateStr = "2023-01-16";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // java.text.ParseException: Unparseable date: "2023.01-16"
        // 解析异常 ParseException
        // ParseException 继承至 Exception 继承至 Throwable
        // ParsePosition pos = new ParsePosition(0);
        // Date date = sdf.parse(dateStr, pos);
        // System.out.println(pos.getIndex());
        // ParseException 运行时异常，也叫受检异常，必须在编码期间手动处理的异常
        Date date = sdf.parse(dateStr);
        System.out.println(date);
    }

    private static void arrayPrint() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3, 4};
        // 运行时异常，RuntimeException
        // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // ArrayIndexOutOfBoundsException 数组越界异常
        // ArrayIndexOutOfBoundsException 继承至 IndexOutOfBoundsException
        // 继承至 RuntimeException 继承至 Exception 继承至 Throwable
        System.out.println(arr[4]);
    }
}
