package com.damahou.day02.extendExercise;

/**
 * @Program SecondStage
 * @ClassName Phone
 * @Package com.damahou.day02
 * @Description Phone
 * @Author DaMaHou
 * @CreateDate 2023-06-25 23:22
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Phone {
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void assistant() {
        System.out.println("speak English ~~~");
    }

    void sendMsg() {
        System.out.println("发短信");
    }
}
