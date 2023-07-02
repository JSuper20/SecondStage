package com.damahou.day01.manager.controller;

import com.damahou.day01.manager.domain.Student;
import com.damahou.day01.manager.service.StudentService;

import java.util.Scanner;

/**
 * @Program SecondStage
 * @ClassName BaseStudentController
 * @Package com.damahou.day01.manager.controller
 * @Description StudentController
 * @Author DaMaHou
 * @CreateDate 2023-06-29 23:25
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public abstract class BaseStudentController {
    /**
     * studentService
     */
    private final StudentService studentService = new StudentService();

    public final void start() {
        Scanner scanner = new Scanner(System.in);
        studentLoop:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.println("开始添加学生");
                    addStudent();
                    break;
                case "2":
                    System.out.println("开始删除学生");
                    delStudent();
                    break;
                case "3":
                    System.out.println("开始修改学生");
                    updateStudent();
                    break;
                case "4":
                    System.out.println("开始查看学生");
                    queryAllStudents();
                    break;
                case "5":
                    System.out.println("感谢使用学生管理系统，退出");
                    break studentLoop;
                default:
                    System.out.println("输入的有误，请重新输入");
                    break;
            }
        }
    }

    /**
     * 修改学生信息
     */
    public final void updateStudent() {
        System.out.println("请输入待修改学生的id：");
        Scanner scanner = new Scanner(System.in);
        String id = getExistsId();
        Student student = inputStudentInfo(scanner, id);
        studentService.updateStudent(student);
        System.out.println("学号为：" + id + "的学生的信息修改成功！");

    }

    /**
     * 输入一个存在的id
     *
     * @return id
     */
    private String getExistsId() {
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            id = scanner.next();
            boolean flag = studentService.idIsExists(id);
            if (!flag) {
                System.out.println("学号不存在，请重新输入：");
            } else {
                break;
            }
        }
        return id;
    }

    /**
     * 删除用户
     */
    public final void delStudent() {
        System.out.println("请输入需要删除用户的id：");
        Scanner scanner = new Scanner(System.in);
        String id = getExistsId();
        /*while (true) {
            id = scanner.next();
            boolean flag = studentService.idIsExists(id);
            if (!flag) {
                System.out.println("学号不存在，请重新输入：");
            } else {
                break;
            }
        }*/
        studentService.delStudent(id);
        System.out.println("删除成功！");
    }


    /**
     * 查询所有学生信息
     */
    public final void queryAllStudents() {
        Student[] stus = studentService.queryAllStudents();
        // System.out.println("学生信息为：" + Arrays.toString(stus));
        if (stus == null) {
            System.out.println("查无信息，请添加后查询");
            return;
        }
        System.out.println("查询到的学生信息为：");
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null) {
                System.out.println(stus[i]);
            }
        }
    }

    /**
     * 添加学生
     */
    public final void addStudent() {
        Scanner scanner = new Scanner(System.in);
        // Teacher student = new Teacher();
        String id;
        while (true) {
            System.out.println("请输入学号：");
            id = scanner.next();
            boolean flag = studentService.idIsExists(id);
            if (flag) {
                System.out.println("学号已存在，请重新输入：");
            } else {
                break;
            }
        }
        /*System.out.println("请输入姓名：");
        student.setName(scanner.next());
        System.out.println("请输入年龄：");
        student.setAge(scanner.next());
        System.out.println("请输入生日：");
        student.setBirthday(scanner.next());*/

        Student student = inputStudentInfo(scanner, id);
        boolean flag = studentService.addStudent(student);
        if (flag) {
            System.out.println("学生添加成功");
        } else {
            System.out.println("学生添加失败");
        }
    }

    /**
     * 输入学生信息
     *
     * @param scanner scanner
     * @param id      id
     * @return Teacher
     */
    public abstract Student inputStudentInfo(Scanner scanner, String id);
}
