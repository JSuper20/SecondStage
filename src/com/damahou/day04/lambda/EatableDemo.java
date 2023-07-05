package com.damahou.day04.lambda;

/**
 * @Program SecondStage
 * @ClassName EatableDemo
 * @Package com.damahou.day04.lambda
 * @Description Lambda练习
 * @Author DaMaHou
 * @CreateDate 2023-07-05 22:09
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class EatableDemo {
    public static void main(String[] args) {
        // 通过创建实现类
        Eatable eatable = new EatableImpl();
        useEatable(eatable);

        // 通过匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我~");
            }
        });

        /*
         * Lambda表达式的使用前提:
         *  - 有一个接口
         *  - 接口中有且仅有一个抽象方法
         */

        // 通过 Lambda 实现
        useEatable(() -> System.out.println("一天一苹果，烦恼远离我…………"));
    }

    public static void useEatable(Eatable eatable) {
        eatable.eat();
    }
}

interface Eatable {
    void eat();
}

class EatableImpl implements Eatable {

    @Override
    public void eat() {
        System.out.println("一天一苹果，疾病远离我！");
    }
}