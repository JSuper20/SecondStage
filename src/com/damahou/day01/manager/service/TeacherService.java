package com.damahou.day01.manager.service;

import com.damahou.day01.manager.dao.TeacherDao;
import com.damahou.day01.manager.domain.Teacher;

import java.util.List;

/**
 * @Program SecondStage
 * @ClassName TeacherService
 * @Package com.damahou.day01.manager.service
 * @Description TeacherService
 * @Author DaMaHou
 * @CreateDate 2023-06-24 10:28
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class TeacherService {
    /**
     * teacherDao
     */
    private TeacherDao teacherDao = new TeacherDao();

    /**
     * 判断工号是否存在
     *
     * @param id
     * @return
     */
    public boolean justiceIdExists(String id) {
        return teacherDao.justiceIdExists(id);
    }

    /**
     * 新增老师
     *
     * @param teacher teacher
     */
    public void addTeacher(Teacher teacher) {
        teacherDao.addTeacher(teacher);
    }

    /**
     * 查看所有老师
     */
    public List<Teacher> queryAllTeacher() {
        return teacherDao.queryAllTeacher();
    }

    /**
     * 删除指定工号的老师
     *
     * @param id 工号
     */
    public void delTeacher(String id) {
        teacherDao.delTeacher(id);
    }

    /**
     * 修改老师信息
     *
     * @param teacher teacher
     */
    public void updateTeacher(Teacher teacher) {
        teacherDao.updateTeacher(teacher);
    }
}
