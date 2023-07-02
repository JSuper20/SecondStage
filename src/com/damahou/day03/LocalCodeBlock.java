package com.damahou.day03;

/**
 * @Program SecondStage
 * @ClassName LocalCodeBlock
 * @Package com.damahou.day03
 * @Description 局部代码块
 * @Author DaMaHou
 * @CreateDate 2023-07-02 9:53
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class LocalCodeBlock {

    public static void method() {
        /*
         * 局部代码块
         * 位置：方法中定义
         * 作用：限定变量的生命周期，及早释放，提高内存利用率；
         * 在局部代码块中定义的变量与方法只能在代码块的范围内使用
         */
        {
            int a = 10;
            System.out.println("局部代码块");
        }
        // a = 20;
        // System.out.println(a);
    }

    public static void main(String[] args) {
        method();
    }
}
