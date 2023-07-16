package com.damahou.day04.exception;

import java.util.Scanner;

/**
 * @Program SecondStage
 * @ClassName ExceptionDemo07
 * @Package com.damahou.day04.exception
 * @Description Exception
 * @Author DaMaHou
 * @CreateDate 2023-07-16 11:58
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ExceptionDemo07 {
    public static void main(String[] args) {
        /*
         * 1.如果 try 中没有遇到问题怎么执行？
         * -- 会把 try 中所有的代码全部执行完毕，不会执行 catch 里面的代码
         * 2.如果 try 中遇到问题，那么 try 下面的代码还会执行吗？
         * -- 出现问题直接跳转到对应的catch语句中，try下面的代码就不会再执行了
         * -- 当 catch 里面的语句全部执行完毕，表示整个体现全部执行完毕，继续执行下面的代码
         * 3.如果出现的问题没有被捕获，那么程序如何运行？
         * -- 那么try……catch 就相当于没有写，就是自己没有处理异常
         * -- 默认交个虚拟机处理
         * 4.同时有可能出现多个异常怎么处理？
         * -- 出现多个异常，那么就写多个 catch 就可以了
         * -- 注意：如果多个异常之间存在子父类关系，那么父类一定要写在下面
         */
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的年龄：");
            String ageStr = sc.nextLine();
            // java.lang.NumberFormatException: For input string: "a"
            int age = Integer.parseInt(ageStr);
            // 出现异常，代码将不再向下执行，而是进入到 catch 中
            System.out.println(age);
            // System.out.println("测试 123 ");
            System.out.println(2 / 0);
        } catch (NullPointerException e) {
            // e.printStackTrace();
            System.out.println("异常捕获成功了吗？");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("测试 456 ");
    }
}
