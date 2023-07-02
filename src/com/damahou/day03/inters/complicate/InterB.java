package com.damahou.day03.inters.complicate;

/**
 * @Program SecondStage
 * @ClassName InterB
 * @Package com.damahou.day03.inters.complicate
 * @Description InterB
 * @Author DaMaHou
 * @CreateDate 2023-07-02 16:54
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public interface InterB {
    public abstract void methodB();

    public default void show() {
        System.out.println("InterB mehtod : show ");
    }
}
