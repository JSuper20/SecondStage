package com.damahou.day03.polymorphism.demo01;

/**
 * @Program SecondStage
 * @ClassName Test
 * @Package com.damahou.day03.polymorphism.demo01
 * @Description test
 * @Author DaMaHou
 * @CreateDate 2023-07-02 17:33
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Cat cat = new Cat();
        cat.eat();
        /*
         * 多态的前提:
         * 1. 要有(继承 \ 实现)关系
         * 2. 要有方法重写
         * 3. 要有父类引用, 指向子类对象
         */
        Animal animal = new Cat();
        animal.eat();
    }
}
