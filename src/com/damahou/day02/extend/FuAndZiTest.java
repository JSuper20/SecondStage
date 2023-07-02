package com.damahou.day02.extend;

/**
 * @Program SecondStage
 * @ClassName FuAndZiTest
 * @Package com.damahou.day02.abstractTest
 * @Description FuAndZiTest
 * @Author DaMaHou
 * @CreateDate 2023-06-29 22:18
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FuAndZiTest {
    public static void main(String[] args) {
        /*
         * 变量获取值先从最近的开始：先在局部里面找，然后在到成员变量位置找，再到父类中找；
         * 同一个类中，当局部变量与成员变量同名时，可以通过 this 关键字来获取成员变量；super 关键字获取父类的相关变量及方法；
         * 同一个类中调用本类的其他方法，在编译时其实会给加上 this 关键字
         */
        Zi zi = new Zi();
        zi.method();
    }
}
