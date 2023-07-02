package com.damahou.day03;

/**
 * @Program SecondStage
 * @ClassName CodeBlockTest
 * @Package com.damahou.day03
 * @Description 代码块测试
 * @Author DaMaHou
 * @CreateDate 2023-07-02 10:00
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class CodeBlockTest {

    /*
     * 静态代码块与构造方法的执行顺序：
     * 父类静态代码块 —— 子类静态代码块 —— 父类构造代码块 —— 父类构造方法 —— 子类构造代码块 —— 子类构造方法
     */

    public static void main(String[] args) {
        Zi z1 = new Zi();
        System.out.println("===========");
        Zi z2 = new Zi(100);
    }
}

class Fu {
    static {
        System.out.println("Fu的静态代码块");
    }

    {
        System.out.println("Fu的构造代码块");
    }

    public Fu() {
        System.out.println("Fu的空参构造方法");
    }

    public Fu(int a) {
        System.out.println("Fu的带参构造方法");
    }
}

class Zi extends Fu {
    static {
        System.out.println("Zi的静态代码块");
    }

    {
        System.out.println("子的构造代码块");
    }

    public Zi() {
        System.out.println("子类空参构造方法");
    }

    public Zi(int a) {
        System.out.println("子类带参构造方法");
    }
}
