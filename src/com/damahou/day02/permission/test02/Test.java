package com.damahou.day02.permission.test02;

import com.damahou.day02.permission.test01.Fu;

/**
 * @Program SecondStage
 * @ClassName Test
 * @Package com.damahou.day02.permission.test02
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-06-25 23:45
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        // protected修饰的方法，可以在同类、同包的子类无关类以及不同包的子类中访问到
        // fu.sleep();

        fu.speak();
    }
}
