package com.damahou.day04.lambda;

/**
 * @Program SecondStage
 * @ClassName AddableDemo
 * @Package com.damahou.day04.lambda
 * @Description Lambda 表达式练习
 * @Author DaMaHou
 * @CreateDate 2023-07-05 22:26
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class AddableDemo {
    public static void main(String[] args) {
        // 匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });

        // Lambda 表达式
        useAddable((int x, int y) -> {return x+y;});
        useAddable((int x, int y) -> x+y);
        useAddable((x,y) -> x + y);
        useAddable(Integer::sum);

    }

    public static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println("sum = " + sum);
    }
}

interface Addable {
    int add(int x, int y);
}
