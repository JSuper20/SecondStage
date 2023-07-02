package com.damahou.day03.polymorphism.demo03;

/**
 * @Program SecondStage
 * @ClassName Test
 * @Package com.damahou.day03.polymorphism.demo03
 * @Description test
 * @Author DaMaHou
 * @CreateDate 2023-07-02 23:19
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        useAnimal(new Cat());
        useAnimal(new Dog());
    }

    public static void useAnimal(Animal animal) {
        animal.eat();
        // animal.watchHome();

        /*
         * java.lang.ClassCastException: class com.damahou.day03.polymorphism.demo03.Cat
         * cannot be cast to class com.damahou.day03.polymorphism.demo03.Dog
         */
        // Dog dog = (Dog) animal;
        // dog.watchHome();

        // 在进行类型转换时，向下转型时，需要先进行类型判断，不然会导致类型转换异常
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHome();
        }
    }

}
