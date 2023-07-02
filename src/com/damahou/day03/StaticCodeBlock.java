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
