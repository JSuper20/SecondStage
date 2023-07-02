package com.damahou.day01.manager.factory;

import com.damahou.day01.manager.dao.BaseStudentInterface;
import com.damahou.day01.manager.dao.OtherStudentDao;

/**
 * @Program SecondStage
 * @ClassName StudentDaoFactory
 * @Package com.damahou.day01.manager.factory
 * @Description StudentDaoFactory
 * @Author DaMaHou
 * @CreateDate 2023-07-02 23:26
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class StudentDaoFactory {

    /**
     * 定义统一方法，获取Dao对象
     *
     * @return dao
     */
    public static BaseStudentInterface getStudentDao() {
        return new OtherStudentDao();
    }
}
