package com.damahou.day04.inner;

/**
 * @Program SecondStage
 * @ClassName SwammingTest
 * @Package com.damahou.day04.inner
 * @Description SwimmingTest
 * @Author DaMaHou
 * @CreateDate 2023-07-05 21:49
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class SwammingTest {
    public static void main(String[] args) {
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("去游泳吧。");
            }
        });
    }

    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}

interface Swimming {
    void swim();
}
