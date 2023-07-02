package com.damahou.day01.manager.dao;

import com.damahou.day01.manager.domain.Student;

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
public class StudentDao {
    // 创建学生对象数组
    private static Student[] stuArray = new Student[5];

    static {
        Student s1 = new Student("001", "ZhangSan", "25", "2001-01-01");
        Student s2 = new Student("002", "ZhangSanFeng", "45", "1978-01-01");

        stuArray[0] = s1;
        stuArray[1] = s2;
    }

    /**
     * 添加学生
     *
     * @param student student
     * @return boolean
     */
    public boolean addStudent(Student student) {
        // 定义变量 index = -1，假设数组已经存满了，没有为null的元素了
        int index = -1;
        for (int i = 0; i < stuArray.length; i++) {
            if (stuArray[i] == null) {
                index = i;
                // 如果结果为null，让index的值记录当前索引，并使用break结束循环
                break;
            }
        }
        // 返回是否成功添加的标志
        if (index == -1) {
            // 添加失败，数组已满
            return false;
        } else {
            // 可以添加
            stuArray[index] = student;
            return true;
        }
    }

    /**
     * 获取所有学生信息
     *
     * @return Teacher[]
     */
    public Student[] getAllStudents() {
        return stuArray;
    }

    /**
     * 根据id删除用户
     *
     * @param id id
     */
    public void deleteById(String id) {
        int index = queryById(id);
        stuArray[index] = null;
    }

    /**
     * 根据id查询元素所在索引位置
     *
     * @param id id
     * @return index
     */
    public int queryById(String id) {
        int index = -1;
        for (int i = 0; i < stuArray.length; i++) {
            if (stuArray[i] != null && stuArray[i].getId().equals(id)) {
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
    public void updateStudent(Student student) {
        int index = queryById(student.getId());
        stuArray[index] = student;
    }
}
