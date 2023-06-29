package com.damahou.day02.permission.test01;

/**
 * @Program SecondStage
 * @ClassName Zi
 * @Package com.damahou.day02.permission.test01
 * @Description Zi
 * @Author DaMaHou
 * @CreateDate 2023-06-25 23:35
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Zi extends Fu {
    public void method() {
        // 子类无法继承父类的私有方法（换句话说，继承到了也不能用）
        // eat();
        // 默认权限修饰符修饰的方法，可以在同类、同包子类无关类中可以访问
        walk();

        // protected修饰的方法，可以在同类、同包的子类无关类以及不同包的子类中访问到
        sleep();

        // 均可访问
        speak();
    }

}
