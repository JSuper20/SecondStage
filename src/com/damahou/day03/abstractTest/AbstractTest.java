package com.damahou.day03.abstractTest;

/**
 * @Program SecondStage
 * @ClassName AbstractTest
 * @Package com.damahou.day03
 * @Description 抽象类练习
 * @Author DaMaHou
 * @CreateDate 2023-07-02 8:52
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class AbstractTest {

    /**
     * 1、抽象类不能直接创建对象
     * 2、抽象类中有构造方法
     * 3、抽象类的子类：
     * a.必须重写父类中的所有抽象方法；
     * b.可以自己也变成一个抽象类
     * 4、抽象类中的方法：可以没有抽象方法，但有抽象方法的类一定是抽象类（有抽象方法是成为抽象类的充分不必要条件）
     */

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.eat();

        // 抽象类不能直接被实例化
        // Animal animal = new Animal();

    }
}
