package com.damahou.day04.api;

import java.util.Objects;

/**
 * @Program SecondStage
 * @ClassName ObjectsTest
 * @Package com.damahou.day04.api
 * @Description Objects工具类的使用
 * @Author DaMaHou
 * @CreateDate 2023-07-09 12:31
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ObjectsTest {
    public static void main(String[] args) {
        /*| public static String toString(对象)             | 返回参数中对象的字符串表示形式。 |
         * | ----------------------------------------------- | -------------------------------- |
         * | public static String toString(对象, 默认字符串) | 返回对象的字符串表示形式。       |
         * | public static Boolean isNull(对象)              | 判断对象是否为空                 |
         * | public static Boolean nonNull(对象)             | 判断对象是否不为空               |
         */

        Student student = new Student("张三", 23);
        System.out.println(student);
        System.out.println(student.toString());
        // Objects.toString() 本质上还是调用的对象中的toString方法
        String stu = Objects.toString(student);
        System.out.println(stu);
        System.out.println("----------------------");

        // Objects.toString(Object o1, String str); 方法会先判断o1是否为null，不为null调用对象的tostring方法；
        // 为null用默认的字符串str
        String string = Objects.toString(student, "1234567");
        System.out.println(string);
        Student st = null;
        String string1 = Objects.toString(st, "9876543210");
        System.out.println(string1);
        System.out.println("---------------------");

        // Objects.isNull(); 判断对象是否为null
        boolean b1 = Objects.isNull(student);
        System.out.println(b1);
        boolean b2 = Objects.isNull(st);
        System.out.println(b2);
        boolean b3 = Objects.nonNull(student);
        System.out.println(b3);
        boolean b4 = Objects.nonNull(st);
        System.out.println(b4);
    }
}

