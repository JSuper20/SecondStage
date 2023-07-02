package com.damahou.day01.manager.controller;

import com.damahou.day01.manager.domain.Teacher;
import com.damahou.day01.manager.service.TeacherService;

import java.util.List;
import java.util.Scanner;

/**
 * @Program SecondStage
 * @ClassName TeacherController
 * @Package com.damahou.day01.manager.controller
 * @Description TeacherController
 * @Author DaMaHou
 * @CreateDate 2023-06-24 10:28
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class TeacherController {

    /**
     * teacherService
     */
    private final TeacherService teacherService = new TeacherService();

    /**
     * 开始老师管理
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        teacherLoop:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.println("添加老师：");
                    addTeacher();
                    break;
                case "2":
                    System.out.println("删除老师：");
                    delTeacher();
                    break;
                case "3":
                    System.out.println("修改老师：");
                    updateTeacher();
                    break;
                case "4":
                    System.out.println("查看老师：");
                    queryAllTeacher();
                    break;
                case "5":
                    System.out.println("退出：");
                    break teacherLoop;
                default:
                    System.out.println("输入有误，请检查！");
                    break;
            }
        }
    }

    /**
     * 修改
     */
    private void updateTeacher() {
        /*System.out.println("请输入待修改老师的工号");
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            id = scanner.next();
            boolean flag = teacherService.justiceIdExists(id);
            if (!flag) {
                System.out.println("输入的工号不存在，请重新输入：");
            } else {
                break;
            }
        }*/
        String id = getExistsId();
        Teacher teacher = inputTeacherInfo(id);
        teacherService.updateTeacher(teacher);
        System.out.println("老师信息修改成功！");
    }

    private String getExistsId() {
        System.out.println("请输入待老师的工号");
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            id = scanner.next();
            boolean flag = teacherService.justiceIdExists(id);
            if (!flag) {
                System.out.println("输入的工号不存在，请重新输入：");
            } else {
                break;
            }
        }
        return id;
    }

    /**
     * 删除
     */
    private void delTeacher() {
        /*System.out.println("请输入待删除老师的工号");
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            id = scanner.next();
            boolean flag = teacherService.justiceIdExists(id);
            if (!flag) {
                System.out.println("输入的工号不存在，请重新输入：");
            } else {
                break;
            }
        }*/
        String id = getExistsId();
        teacherService.delTeacher(id);
    }

    /**
     * 查看所有老师
     */
    private void queryAllTeacher() {
        List<Teacher> list = teacherService.queryAllTeacher();
        if (list == null || list.isEmpty()) {
            System.out.println("当前老师信息为空，请录入后查看！");
            return;
        }
        System.out.println(list);
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }

    /**
     * 新增老师
     */
    public void addTeacher() {
        System.out.println("请输入老师工号：");
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            id = scanner.next();
            // 判断工号是否存在
            boolean flag = teacherService.justiceIdExists(id);
            if (flag) {
                System.out.println("该工号已存在，请重新输入：");
            } else {
                break;
            }
        }
        Teacher teacher = inputTeacherInfo(id);
        teacherService.addTeacher(teacher);
        System.out.println("老师添加成功！");
    }

    /**
     * 老师信息录入
     *
     * @param id id
     * @return Student
     */
    private Teacher inputTeacherInfo(String id) {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();
        teacher.setId(id);
        System.out.println("请输入老师姓名：");
        teacher.setName(scanner.next());
        System.out.println("请输入老师年龄：");
        teacher.setAge(scanner.next());
        System.out.println("请输入老师生日：");
        teacher.setBirthday(scanner.next());
        return teacher;
    }

}
