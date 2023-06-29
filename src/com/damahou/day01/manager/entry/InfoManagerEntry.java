package com.damahou.day01.manager.entry;

import com.damahou.day01.manager.controller.OtherStudentController;
import com.damahou.day01.manager.controller.TeacherController;

import java.util.Scanner;

/**
 * @Program SecondStage
 * @ClassName InfoManagerEntry
 * @Package com.damahou.day01.manager.entry
 * @Description InfoManagerEntry
 * @Author DaMaHou
 * @CreateDate 2023-06-19 0:02
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.println("学生管理");
                    // StudentController smc = new StudentController();
                    OtherStudentController smc = new OtherStudentController();
                    // 开启学生管理系统
                    smc.start();
                    break;
                case "2":
                    System.out.println("老师管理系统");
                    // 开启老师管理系统
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case "3":
                    System.out.println("感谢使用黑马信息管理系统，再见");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您输入的有误，请重新输入");
                    break;
            }
        }
    }
}
