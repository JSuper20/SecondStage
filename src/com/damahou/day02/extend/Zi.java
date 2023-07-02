package com.damahou.day02.extend;

/**
 * @Program SecondStage
 * @ClassName Zi
 * @Package com.damahou.day02.abstractTest
 * @Description Zi
 * @Author DaMaHou
 * @CreateDate 2023-06-29 22:17
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Zi extends Fu {
    int a = 20;

    @Override
    public void show() {
        System.out.println("子类show方法");
    }

    public void method() {
        int a = 30;
        // 30
        System.out.println(a);
        // 20
        System.out.println(this.a);
        // 10
        System.out.println(super.a);

        System.out.println("----------------");

        // show(); == this.show();
        show();

        super.show();
    }
}
