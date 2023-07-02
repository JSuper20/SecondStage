package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName Inter
 * @Package com.damahou.day03
 * @Description Inter
 * @Author DaMaHou
 * @CreateDate 2023-07-02 12:41
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public interface Inter {
    // 接口中定义的变量默认被 public static final 修饰，就是一个常量值
    public static final int NUMBER = 10;

    // 接口中定义的抽象方法默认被 public abstract 修饰
    public abstract void print();

    // 接口中没有构造方法
    /*public class Inter() {

    }*/
}
