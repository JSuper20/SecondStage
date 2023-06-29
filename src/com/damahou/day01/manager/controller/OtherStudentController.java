package com.damahou.day01.manager.controller;

import com.damahou.day01.manager.domain.Student;

import java.util.Scanner;

/**
 * @Program SecondStage
 * @ClassName StudentController
 * @Package com.damahou.day01.manager.controller
 * @Description StudentController
 * @Author DaMaHou
 * @CreateDate 2023-06-18 23:47
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class OtherStudentController extends BaseStudentController {
    /**
     * 输入学生信息
     *
     * @param scanner scanner
     * @param id      id
     * @return Teacher
     */
    @Override
    public Student inputStudentInfo(Scanner scanner, String id) {
        System.out.println("请输入学生姓名：");
        String name = scanner.next();
        System.out.println("请输入学生年龄：");
        String age = scanner.next();
        System.out.println("请输入学生生日：");
        String birthday = scanner.next();
        Student student = new Student(id, name.trim(), age, birthday);
        return student;
    }
}
