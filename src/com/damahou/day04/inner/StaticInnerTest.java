package com.damahou.day04.inner;

/**
 * @Program SecondStage
 * @ClassName StaticInnerTest
 * @Package com.damahou.day04.inner
 * @Description 静态内部类
 * @Author DaMaHou
 * @CreateDate 2023-07-05 21:22
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class StaticInnerTest {
    public static void main(String[] args) {
        /*
         * 静态内部类的创建方式：
         * 外部类名.内部类名 对象名 = new 外部类名.内部类名();
         */
        // StaticOuter.StaticInner ss = new StaticOuter().new StaticInner();
        StaticOuter.StaticInner ss = new StaticOuter.StaticInner();
        ss.show();
        // ss.method();
        StaticOuter.StaticInner.method();
    }
}

class StaticOuter {

    static class StaticInner {
        public void show() {
            System.out.println("inner show 。。。");
        }

        public static void method() {
            System.out.println("inner method ~~~");
        }
    }


}
