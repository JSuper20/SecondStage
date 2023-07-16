package com.damahou.day04.exception;

import java.util.Scanner;

/**
 * @Program SecondStage
 * @ClassName ExceptionDemo09
 * @Package com.damahou.day04.exception
 * @Description Exception
 * @Author DaMaHou
 * @CreateDate 2023-07-16 12:36
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ExceptionDemo09 {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        student.setName(name);
        System.out.println("请输入年龄：");
        while (true) {
            String ageStr = sc.nextLine();
            try {
                int age = Integer.parseInt(ageStr);
                student.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数：");
                continue;
            } catch (RuntimeException e) {
                System.out.println(e.toString());
                System.out.println("请输入一个18~25之内的年龄：");
                continue;
            }
        }
        System.out.println(student);
    }
}
