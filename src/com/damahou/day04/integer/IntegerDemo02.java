package com.damahou.day04.integer;

/**
 * @Program SecondStage
 * @ClassName IntegerDemo02
 * @Package com.damahou.day04.integer
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 16:20
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        /**
         * - 自动装箱
         *   	把基本数据类型转换为对应的包装类类型
         *
         * - 自动拆箱
         *   	把包装类类型转换为对应的基本数据类型
         */
        // 自动装箱：将基本数据类型转换为包装类型
        Integer i1 = 100;
        // 先自动拆箱，再自动装箱
        // 自动拆箱将包装类型的Integer拆为int类型，再参与运算，再将结果自动装箱为Integer类型
        i1 += 200;
        System.out.println(i1);
    }
}
