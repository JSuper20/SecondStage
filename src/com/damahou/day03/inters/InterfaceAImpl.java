package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName InterfaceAImpl
 * @Package com.damahou.day03.inters
 * @Description impl
 * @Author DaMaHou
 * @CreateDate 2023-07-02 16:21
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class InterfaceAImpl implements InterfaceA {

    public static void main(String[] args) {

        /*
         * jdk 9 在接口中新增了私有方法与私有静态方法，使得私有方法仅在接口中可以使用，私有静态方法也是。
         */

        InterfaceAImpl inter = new InterfaceAImpl();
        inter.start();
        inter.end();
        // 如何将log方法隐藏，起来不给实现类调用
        // inter.log();

        InterfaceA.open();
        InterfaceA.close();
        // 将静态的隐藏不在外部调用
        // InterfaceA.check();
    }
}
