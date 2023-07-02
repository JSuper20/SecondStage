package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName InterC
 * @Package com.damahou.day03
 * @Description InterC
 * @Author DaMaHou
 * @CreateDate 2023-07-02 16:00
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public interface InterC extends InterA, InterB {
    /*
     * 接口可以单继承、多继承、多层继承；
     */
    @Override
    public abstract void show();
}
