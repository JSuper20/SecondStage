package com.damahou.day03.polymorphism.demo02;

/**
 * @Program SecondStage
 * @ClassName Test
 * @Package com.damahou.day03.polymorphism.demo02
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-02 17:38
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        /**
         * 多态中成员访问特点：
         * 构造方法：同继承一样，子类会通过 super 访问父类构造方法
         * 成员变量：编译看左边（父类），执行看左边（父类）
         * 成员方法：编译看左边（父类），执行看右边（子类）
         */

        // 1、向上转型：父类引用指向子类对象
        Fu fu = new Zi();
        System.out.println(fu.num);
        fu.method();

        // 多态的弊端：不能调用子类中的特有方法
        // fu.show();

        /*
         * 调用子类的特有方法的方式：
         * （1）直接创建子类对象，由子类对象调用；
         * （2）向下转型：将父类再转回到子类类型
         */

        // 向下转型：从父类类型，转换到子类类型
        Zi zi = (Zi) fu;
        zi.show();
    }
}
