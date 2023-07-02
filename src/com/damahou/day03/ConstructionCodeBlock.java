package com.damahou.day03;

/**
 * @Program SecondStage
 * @ClassName ConstructionCodeBlock
 * @Package com.damahou.day03
 * @Description 构造代码块
 * @Author DaMaHou
 * @CreateDate 2023-07-02 9:49
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ConstructionCodeBlock {

    /*
     * 构造代码块
     * 位置：类中方法外定义
     * 特点：每次构造方法执行的时，都会执行该代码块中的代码，并且在构造方法执行前执行
     * 作用：将多个构造方法中相同的代码，抽取到构造代码块中，提高代码的复用性
     */

    {
        System.out.println("构造代码块");
    }

    public ConstructionCodeBlock() {
        System.out.println("空参构造");
    }

    public ConstructionCodeBlock(int a) {
        System.out.println("带参构造~~~~~~~~");
    }

    public static void main(String[] args) {
        ConstructionCodeBlock c1 = new ConstructionCodeBlock();
        ConstructionCodeBlock c2 = new ConstructionCodeBlock(10);
    }
}
