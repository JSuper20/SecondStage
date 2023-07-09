package com.damahou.day04.api;

import java.math.BigDecimal;

/**
 * @Program SecondStage
 * @ClassName BigDecimalDemo02
 * @Package com.damahou.day04.api
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 14:08
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class BigDecimalDemo02 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(0.1);
        BigDecimal b2 = new BigDecimal("0.1");
        System.out.println(b1);
        System.out.println(b2);

        // 如果需要进行精确计算，构造方法需使用字符串的
        BigDecimal b3 = new BigDecimal(10.1);
        BigDecimal b4 = new BigDecimal("10.0");
        System.out.println(b3);
        System.out.println(b4);
    }
}
