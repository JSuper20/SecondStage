package com.damahou.day04.integer;

/**
 * @Program SecondStage
 * @ClassName IntegerDemo01
 * @Package com.damahou.day04.integer
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 16:15
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class IntegerDemo01 {
    public static void main(String[] args) {
        /*
         * | public Integer(int   value)             | 根据 int 值创建 Integer 对象(过时)       |
         * | --------------------------------------- | ---------------------------------------- |
         * | public Integer(String s)                | 根据 String 值创建 Integer 对象(过时)    |
         * | public static Integer valueOf(int i)    | 返回表示指定的 int 值的 Integer   实例   |
         * | public static Integer valueOf(String s) | 返回一个保存指定值的 Integer 对象 String |
         */

        // Deprecated
        /*Integer i1 = new Integer(100);
        System.out.println(i1);
        Integer i2 = new Integer("200");
        System.out.println(i2);*/

        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);
        Integer i4 = Integer.valueOf("200");
        System.out.println(i4);
    }
}
