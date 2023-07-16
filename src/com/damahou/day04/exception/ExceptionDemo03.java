package com.damahou.day04.exception;

/**
 * @Program SecondStage
 * @ClassName ExceptionDemo03
 * @Package com.damahou.day04.exception
 * @Description Exception 练习
 * @Author DaMaHou
 * @CreateDate 2023-07-16 11:16
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        // 控制台 console 为什么会有红色的字体，是谁打印的？
        int[] arr = new int[]{1, 2, 3, 4};
        // ArrayIndexOutOfBoundsException
        System.out.println(arr[5]);
        // 出现异常后，将不会继续向下执行
        System.out.println("66666666666");
        // 当代码出现异常时，在出现异常的位置会创建一个异常对象
        // new ArrayIndexOutOfBoundsException() 对象
        // 首先会看，程序中有没有自己处理异常；
        // 如果没有，就会交给本方法的调用者进行处理，如果调用者也没有自己处理；
        // 最终这个异常会交个虚拟机默认处理；
        // JVM 默认处理异常做了那几件事？
        //  1.将异常以红色字体展示在控制台
        //  2.停止程序运行。--- 哪里出现了一场，那么程序就在哪里终止，下面的代码将不再执行。
    }
}
