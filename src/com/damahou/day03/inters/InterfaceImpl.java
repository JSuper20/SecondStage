package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName InterAImpl
 * @Package com.damahou.day03
 * @Description InterAImpl
 * @Author DaMaHou
 * @CreateDate 2023-07-02 13:46
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */

public class InterfaceImpl implements InterC {
    /*
     * 类与接口的关系，一个类可以实现一个接口，也可以实现多个接口；
     * 类在实现接口的时候，也可以继承父类（只能继承一个父类）
     */

    /**
     * 当一个类实现多个接口，且多个接口中有同名的方法，则实现类必须重写该方法
     */
    @Override
    public void show() {
        System.out.println("重写后的show");
    }

    /**
     * @param args args
     */
    public static void display(String[] args) {
        System.out.println("子类新定义的display静态方法");
    }
}
