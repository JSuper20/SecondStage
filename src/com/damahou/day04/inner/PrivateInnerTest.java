package com.damahou.day04.inner;

/**
 * @Program SecondStage
 * @ClassName PrivateInnerTest
 * @Package com.damahou.day04.inner
 * @Description 私有内部类
 * @Author DaMaHou
 * @CreateDate 2023-07-05 21:17
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class PrivateInnerTest {
    public static void main(String[] args) {
        // Outer.Inner oi = new OuterClass().new InnerClass();
        OuterClass outerClass = new OuterClass();
        outerClass.method();
    }
}

class OuterClass {
    private int num = 10;

    private class InnerClass {
        public void show() {
            System.out.println("num = " + num);
        }
    }

    public void method() {
        InnerClass in = new InnerClass();
        in.show();
    }
}
