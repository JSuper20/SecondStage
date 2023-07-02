package com.damahou.day01.manager.dao;

import com.damahou.day01.manager.domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program SecondStage
 * @ClassName StudentDao
 * @Package com.damahou.day01.manager.dao
 * @Description StudentDao
 * @Author DaMaHou
 * @CreateDate 2023-06-19 0:02
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class OtherStudentDao implements BaseStudentInterface {
    // 创建学生集合
    private static List<Student> stuList = new ArrayList<>();

    static {
        Student s1 = new Student("001", "ZhangSan", "25", "2001-01-01");
        Student s2 = new Student("002", "ZhangSanFeng", "45", "1978-01-01");

        stuList.add(s1);
        stuList.add(s2);
    }

    /**
     * 添加学生
     *
     * @param student student
     * @return boolean
     */
    @Override
    public boolean addStudent(Student student) {
        stuList.add(student);
        return true;
    }

    /**
     * 获取所有学生信息
     *
     * @return Teacher[]
     */
    @Override
    public Student[] getAllStudents() {
        Student[] stuArr = new Student[stuList.size()];
        for (int i = 0; i < stuList.size(); i++) {
            stuArr[i] = stuList.get(i);
        }
        return stuArr;
    }

    /**
     * 根据id删除用户
     *
     * @param id id
     */
    @Override
    public void deleteById(String id) {
        int index = queryById(id);
        stuList.remove(index);
    }

    /**
     * 根据id查询元素所在索引位置
     *
     * @param id id
     * @return index
     */
    @Override
    public int queryById(String id) {
        int index = -1;
        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * 修改学生信息
     *
     * @param student student
     */
    @Override
    public void updateStudent(Student student) {
        int index = queryById(student.getId());
        stuList.set(index, student);
    }
}
