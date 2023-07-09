package com.damahou.day04.api;

/**
 * @Program SecondStage
 * @ClassName StudentTest
 * @Package com.damahou.day04.api
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-08 15:43
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(26);
        System.out.println(student);
        System.out.println(student.toString());
        System.out.println("======================");


        Student s1 = new Student("张三", 26);
        Student s2 = new Student("张三", 26);
        System.out.println(s1 == s2);
        // 如果类中没有重写父类中的equals方法，则使用equals方法时会使用Object中的equals方法，比较的是两个对象的地址值；
        // 重写equals和hashcode方法后，equals方法比较的是属性值
        System.out.println(s1.equals(s2));
    }
}
