package com.damahou.day04.api;

/**
 * @Program SecondStage
 * @ClassName StringTest
 * @Package com.damahou.day04.api
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-08 19:51
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "1111111";
        StringBuffer sb = new StringBuffer("1111111");

        // s对象时String，则使用equals方法是调用的String中的equals方法
        // 会先判断对象的类型是否也是String，如果不是则直接返回false；
        // 如果是，才会比较值
        System.out.println(s.equals(sb));

        // sb对象时StringBuffer，而StringBuffer中没有自己重写equals方法，故调用的是Object中的equals方法，比较的是地址值
        System.out.println(sb.equals(s));
    }
}
