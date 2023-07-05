package com.damahou.day04.inner;

/**
 * @Program SecondStage
 * @ClassName PartialInnerTest
 * @Package com.damahou.day04.inner
 * @Description PartialInnerTest
 * @Author DaMaHou
 * @CreateDate 2023-07-05 21:28
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class PartialInnerTest {
    public static void main(String[] args) {
        /*
         *- 局部内部类定义位置
         *- 局部内部类是在方法中定义的类
         *- 局部内部类方式方式
         *- 局部内部类，外界是无法直接使用，需要在方法内部创建对象并使用
         *- 该类可以直接访问外部类的成员，也可以访问方法内的局部变量
         */
        PartialOuter out = new PartialOuter();
        out.method();
    }
}

class PartialOuter {
    int num1 = 10;

    public void method() {
        int num2 = 20;
        class PartialInner {
            public void show() {
                System.out.println("num1 = " + num1);
                System.out.println("num2 = " + num2);
            }
        }
        PartialInner in = new PartialInner();
        in.show();
    }
}
