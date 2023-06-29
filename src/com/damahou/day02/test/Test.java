package com.damahou.day02.test;

/**
 * @Program SecondStage
 * @ClassName Test
 * @Package com.damahou.day02.extend
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-06-29 22:56
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();

    }
}

class Fu {
    int age;

    public Fu() {
        System.out.println("Fu类的空参构造");
    }

    public Fu(int age) {
        this.age = age;
        System.out.println("Fu类的带参构造");
    }
}

class Zi extends Fu {

    public Zi() {
        /*
         * super(); 与 this(); 只能二选一
         */
        // super();
        this(100);
        System.out.println("Zi的空参构造");
    }

    public Zi(int age) {
        super(age);
        System.out.println("Zi的带参构造");
    }
}