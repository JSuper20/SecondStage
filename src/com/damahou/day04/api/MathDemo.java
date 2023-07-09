package com.damahou.day04.api;

/**
 * @Program SecondStage
 * @ClassName MathDemo
 * @Package com.damahou.day04.api
 * @Description Math相关方法使用练习
 * @Author DaMaHou
 * @CreateDate 2023-07-08 15:04
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class MathDemo {
    public static void main(String[] args) {
        /*
         * public static XXX abs(XXX xxx)                  返回绝对值
         * public static double ceil(double a)             返回大于或等于参数的最小double值，等于一个整数
         * public static double floor(double a)            返回小于或等于参数的最大double值，等于一个整数
         * public   static int round(float a)              按照四舍五入返回最接近参数的int
         * public static int   max(int a,int b)            返回两个int值中的较大值
         * public   static int min(int a,int b)            返回两个int值中的较小值
         * public   static double pow (double a,double b)  返回a的b次幂的值
         * public   static double random()                 返回值为double的正值，[0.0,1.0)
         */

        System.out.println(Math.abs(-3));
        System.out.println(Math.abs(-3.14F));
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(0.0));
        System.out.println(Math.abs(1.2F));
        System.out.println(Math.abs(1.2));
        System.out.println(Math.abs(2));
        System.out.println("=======================");

        System.out.println(Math.ceil(0.0));
        System.out.println(Math.ceil(0.001));
        System.out.println(Math.ceil(2.0));
        System.out.println(Math.ceil(3.41));
        System.out.println(Math.ceil(-4.8));
        System.out.println("=======================");

        System.out.println(Math.floor(0.0));
        System.out.println(Math.floor(0.001));
        System.out.println(Math.floor(2.0));
        System.out.println(Math.floor(3.41));
        System.out.println(Math.floor(-4.8));
        System.out.println("=======================");

        System.out.println(Math.round(0.0F));
        System.out.println(Math.round(0.001F));
        System.out.println(Math.round(2.0F));
        System.out.println(Math.round(3.41F));
        System.out.println(Math.round(-4.8F));
        System.out.println("=======================");

        System.out.println(Math.max(0, 0));
        System.out.println(Math.max(0, 1));
        System.out.println(Math.max(0, -1));
        System.out.println(Math.max(1, 2));
        System.out.println(Math.max(-1, 2));
        System.out.println("=======================");

        System.out.println(Math.min(0, 0));
        System.out.println(Math.min(0, 1));
        System.out.println(Math.min(0, -1));
        System.out.println(Math.min(1, 2));
        System.out.println(Math.min(-1, 2));
        System.out.println("=======================");

        System.out.println(Math.pow(0.0, 0.0));
        System.out.println(Math.pow(-0.01, 0.00));
        System.out.println(Math.pow(-1.01, 2.0));
        System.out.println(Math.pow(1.01, 2.3));
        System.out.println(Math.pow(10.0, 2.0));
        System.out.println("=======================");

        System.out.println(Math.random());
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}
