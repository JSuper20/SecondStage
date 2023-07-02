package com.damahou.day01.manager.service;

import com.damahou.day01.manager.dao.BaseStudentInterface;
import com.damahou.day01.manager.domain.Student;
import com.damahou.day01.manager.factory.StudentDaoFactory;

/**
 * @Program SecondStage
 * @ClassName StudentService
 * @Package com.damahou.day01.manager.service
 * @Description StudentService
 * @Author DaMaHou
 * @CreateDate 2023-06-18 23:47
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class StudentService {
    /**
     * studentDao
     */
    // private StudentDao studentDao = new StudentDao();
    // private OtherStudentDao studentDao = new OtherStudentDao();
    /**
     * 通过学生库管工厂类, 获取库管对象
     */
    private BaseStudentInterface studentDao = StudentDaoFactory.getStudentDao();

    /**
     * 添加学生
     *
     * @param student student
     * @return boolean
     */
    public boolean addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    /**
     * 判断学号是否已存在
     *
     * @param id id
     * @return boolean
     */
    public boolean idIsExists(String id) {
        Student[] stus = studentDao.getAllStudents();
        boolean flag = false;
        for (Student student : stus) {
            if (student != null && student.getId().equals(id)) {
                flag = true;
                break;
            }
        }
        /*for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null && stus[i].getId().equals(id)) {
                flag = true;
                break;
            }
        }*/
        return flag;

    }

    /**
     * 查询所有学生信息
     *
     * @return Teacher[]
     */
    public Student[] queryAllStudents() {
        Student[] stus = studentDao.getAllStudents();
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null) {
                flag = true;
                break;
            }
        }
        return flag ? stus : null;
    }

    /**
     * 删除用户
     *
     * @param id id
     */
    public void delStudent(String id) {
        studentDao.deleteById(id);
    }

    /**
     * 修改学生信息
     *
     * @param student student
     */
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
}
