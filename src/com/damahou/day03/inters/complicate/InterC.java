package com.damahou.day03.inters.complicate;

/**
 * @Program SecondStage
 * @ClassName InterC
 * @Package com.damahou.day03.inters.complicate
 * @Description InterC
 * @Author DaMaHou
 * @CreateDate 2023-07-02 16:55
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public interface InterC extends InterA, InterB {

    @Override
    default void show() {
        System.out.println("InterC接口,解决代码逻辑冲突问题, 重写method方法");
    }
}
