package com.damahou.day04.inner;

/**
 * @Program SecondStage
 * @ClassName InnerTest
 * @Package com.damahou.day04.inner
 * @Description InnerTest
 * @Author DaMaHou
 * @CreateDate 2023-07-02 23:47
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class InnerTest {
    public static void main(String[] args) {
        /*
         * 内部类的对象的创建格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
         * Outer.Inner oi = new Outer().new Inner();
         */
        Outer.Inner inner = new Outer().new Inner();
        inner.print();
        inner.method();
        System.out.println(inner.c);
    }
}

/*
 * 内部类的访问特点:
 * 内部类可以直接访问外部类的成员，包括私有
 * 外部类要访问内部类的成员，必须创建对象
 */
class Outer {
    int a = 10;
    private int b = 20;

    public void show() {
        System.out.println("外部类的show");
    }

    // 在一个类中定义一个类。举例：在一个类A的内部定义一个类B，类B就被称为内部类
    public class Inner {
        int c = 15;

        /*
         * 内部类可以直接访问外部类的成员变量与成员方法
         */
        public void print() {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }

        public void method() {
            show();
        }
    }
}
