package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName InterImpl
 * @Package com.damahou.day03
 * @Description InterImpl
 * @Author DaMaHou
 * @CreateDate 2023-07-02 12:43
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class InterImpl implements Inter {

    @Override
    public void print() {
        System.out.println("print" + "      " + NUMBER);
    }
}
