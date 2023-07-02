package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName Interface
 * @Package com.damahou.day03.inters
 * @Description Interface
 * @Author DaMaHou
 * @CreateDate 2023-07-02 16:31
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public interface Interface {
    public default void defShow() {
        System.out.println("接口的defShow方法");
    }

    public abstract void show();
}
