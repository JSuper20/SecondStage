package com.damahou.day02.extendExercise;

/**
 * @Program SecondStage
 * @ClassName PhoneTest
 * @Package com.damahou.day02
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-06-25 23:25
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        newPhone.assistant();
        System.out.println("----------");
        newPhone.call("张三");
        newPhone.sendMsg();
    }
}
