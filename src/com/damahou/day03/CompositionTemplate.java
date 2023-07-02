package com.damahou.day03;

/**
 * @Program SecondStage
 * @ClassName CompositionTemplate
 * @Package com.damahou.day03
 * @Description Template模版模式
 * @Author DaMaHou
 * @CreateDate 2023-07-02 9:14
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public abstract class CompositionTemplate {

    /*
     * final 关键字
     * final 关键字是最终的意思，可以修饰（方法、变量、类）
     * 特点：
     * 1、修饰方法；表明该方法是最终方法，不能被重写；
     * 2、修饰变量：表明该变量是常量，不能被再次赋值；
     * 3、修饰类；表明该类是最终类，不能被继承。
     *
     * final 修饰变量时：
     * 修饰基本类型变量；其值不能再发生改变；
     * 修饰引用类型变量：引用类型的地址值不能发生变化，但是地址值里面的内容是可以发生改变的。
     */

    public final void write() {
        System.out.println("<<我的爸爸>>");

        body();

        System.out.println("啊，这就是我的爸爸");
    }

    public abstract void body();
}
