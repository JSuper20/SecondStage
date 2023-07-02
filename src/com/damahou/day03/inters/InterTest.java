package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName InterTest
 * @Package com.damahou.day03
 * @Description InterTest
 * @Author DaMaHou
 * @CreateDate 2023-07-02 12:44
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class InterTest {
    public static void main(String[] args) {
        Inter inter = new InterImpl();
        // 接口中定义的成员变量会被 public static final 修饰，相当于是一个常量
        System.out.println(Inter.NUMBER);
        System.out.println("---------");
        inter.print();
    }
}
