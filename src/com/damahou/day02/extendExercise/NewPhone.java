package com.damahou.day02.extendExercise;

/**
 * @Program SecondStage
 * @ClassName NewPhone
 * @Package com.damahou.day02
 * @Description NewPhone
 * @Author DaMaHou
 * @CreateDate 2023-06-25 23:25
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class NewPhone extends Phone {
    @Override
    public void assistant() {
        super.assistant();
        System.out.println("说中文。。。");
    }

    // 重写：子类访问权限必须大于等于父类，不能将访问权限越写越小
    /*@Override
    private void sendMsg() {
        super.sendMsg();
    }*/

    @Override
    protected void sendMsg() {
        super.sendMsg();
    }
}
