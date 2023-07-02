package com.damahou.day01.manager.dao;

import com.damahou.day01.manager.domain.Student;

/**
 * @Program SecondStage
 * @ClassName BaseStudentInterface
 * @Package com.damahou.day01.manager.dao
 * @Description BaseStudentInterface
 * @Author DaMaHou
 * @CreateDate 2023-06-19 0:02
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public interface BaseStudentInterface {

    /**
     * 添加学生
     *
     * @param student student
     * @return boolean
     */
    public abstract boolean addStudent(Student student);

    /**
     * 获取所有学生信息
     *
     * @return Teacher[]
     */
    public abstract Student[] getAllStudents();

    /**
     * 根据id删除用户
     *
     * @param id id
     */
    public abstract void deleteById(String id);

    /**
     * 根据id查询元素所在索引位置
     *
     * @param id id
     * @return index
     */
    public abstract int queryById(String id);

    /**
     * 修改学生信息
     *
     * @param student student
     */
    public abstract void updateStudent(Student student);
}
