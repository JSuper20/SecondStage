package com.damahou.day02.permission.test02;

import com.damahou.day02.permission.test01.Fu;

/**
 * @Program SecondStage
 * @ClassName Su
 * @Package com.damahou.day02.permission.test02
 * @Description Su
 * @Author DaMaHou
 * @CreateDate 2023-06-25 23:45
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Su extends Fu {

    public void method() {
        // 被private或默认修饰符修饰的方法只能在同包下访问
        // eat();
        // walk();

        // protected修饰的方法，可以在同类、同包的子类无关类以及不同包的子类中访问到
        sleep();

        speak();

    }
}
