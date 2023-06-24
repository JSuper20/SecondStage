package com.damahou.day01.manager.dao;

import com.damahou.day01.manager.domain.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program SecondStage
 * @ClassName TeacherDao
 * @Package com.damahou.day01.manager.dao
 * @Description TeacherDao
 * @Author DaMaHou
 * @CreateDate 2023-06-24 10:27
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class TeacherDao {

    /**
     * 容器，存放老师信息
     */
    private static List<Teacher> list = new ArrayList<>();

    /**
     * 判断id是否存在
     *
     * @param id id
     * @return boolean
     */
    public boolean justiceIdExists(String id) {
        int index = queryTeacherId(id);
        /*
        boolean flag = false;
        if (list != null && !list.isEmpty()) {
            for (Teacher teacher : list) {
                if (teacher.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }
        }*/
        return index != -1;
    }

    /**
     * 获取索引
     *
     * @param id 工号
     * @return int
     */
    public int queryTeacherId(String id) {
        int index = -1;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(id)) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    /**
     * 新增老师
     *
     * @param teacher teacher
     */
    public void addTeacher(Teacher teacher) {
        list.add(teacher);
    }

    /**
     * 查询所有
     *
     * @return list
     */
    public List<Teacher> queryAllTeacher() {
        return list;
    }

    /**
     * 删除老师
     *
     * @param id 工号
     */
    public void delTeacher(String id) {
        int index = queryTeacherId(id);
        Teacher remove = list.remove(index);
        System.out.println("删除的老师信息为：" + remove);
    }

    /**
     * 修改老师信息
     *
     * @param teacher teacher
     */
    public void updateTeacher(Teacher teacher) {
        int index = queryTeacherId(teacher.getId());
        list.remove(index);
        list.add(teacher);
    }
}
