package com.damahou.day02.permission.test01;

/**
 * @Program SecondStage
 * @ClassName Test
 * @Package com.damahou.day02.permission.test01
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-06-25 23:35
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        // 访问修饰符为private，仅限在同类中进行访问
        // fu.eat();

        // 默认权限修饰符修饰的方法，可以在同类、同包的子类无关类中可以访问
        fu.walk();

        // protected修饰的方法，可以在同类、同包的子类无关类以及不同包的子类中访问到
        fu.sleep();

        fu.speak();
    }
}
