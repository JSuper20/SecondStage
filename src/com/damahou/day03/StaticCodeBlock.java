package com.damahou.day03;

/**
 * @Program SecondStage
 * @ClassName StaticCodeBlock
 * @Package com.damahou.day03
 * @Description 静态代码块
 * @Author DaMaHou
 * @CreateDate 2023-07-02 9:57
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class StaticCodeBlock {

    /*
     * 静态代码块
     * 位置：类中方法外定义
     * 特点：需要通过static关键字修饰，随着类的加载而加载，并且只执行一次
     * 作用：在类加载的时候做一些数据初始化的操作
     */

    static {
        System.out.println("静态代码块");
    }

    public StaticCodeBlock() {
        System.out.println("空参构造");
    }

    public StaticCodeBlock(int a) {
        System.out.println("带参构造");
    }

    public static void main(String[] args) {
        StaticCodeBlock b1 = new StaticCodeBlock();
        StaticCodeBlock b2 = new StaticCodeBlock(100);
    }
}
