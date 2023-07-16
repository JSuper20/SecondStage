package com.damahou.day04.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Program SecondStage
 * @ClassName ExceptionDemo04
 * @Package com.damahou.day04.exception
 * @Description Exception
 * @Author DaMaHou
 * @CreateDate 2023-07-16 11:25
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ExceptionDemo04 {
    public static void main(String[] args) throws ParseException {
        // 调用者没有处理异常，将会交给JVM虚拟机使用默认的异常处理机制进行处理
        // method01();

        // 调用者没有处理异常，将会交给JVM虚拟机使用默认的异常处理机制进行处理
        method02();
    }

    // 编译时异常，在进行编译时就会就进行检查，不处理则编译不通过
    private static void method02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.parse("2023.07-16"));
    }

    // 运行时异常可以省略
    private static void method01() /*throws NullPointerException*/ {
        // int[] arr = new int[]{1, 2, 3, 4};
        int[] arr = null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
