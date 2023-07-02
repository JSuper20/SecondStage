package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName InterfaceTest
 * @Package com.damahou.day03
 * @Description InterfaceTest
 * @Author DaMaHou
 * @CreateDate 2023-07-02 13:46
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        InterA a = new InterfaceImpl();
        a.show();

        // a.display();
        InterA.display();

        InterB.display();
    }
}
