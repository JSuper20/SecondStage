package com.damahou.day04.api;

import java.math.BigDecimal;

/**
 * @Program SecondStage
 * @ClassName BigDecimalDemo03
 * @Package com.damahou.day04.api
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 15:02
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class BigDecimalDemo03 {
    public static void main(String[] args) {
        /*
         * - | public BigDecimal add(另一个BigDecimal对象)                  | 加法 |
         *   | ------------------------------------------------------------ | ---- |
         *   | public BigDecimal subtract (另一个BigDecimal对象)            | 减法 |
         *   | public BigDecimal multiply (另一个BigDecimal对象)            | 乘法 |
         *   | public BigDecimal divide (另一个BigDecimal对象)              | 除法 |
         *   | public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式) | 除法 |
         *
         */
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal add = b1.add(b2);
        System.out.println("add = " + add);
        BigDecimal subtract = b1.subtract(b2);
        System.out.println("subtract = " + subtract);
        BigDecimal multiply = b1.multiply(b2);
        System.out.println("multiply =" + multiply);
        BigDecimal divide = b1.divide(b2);
        System.out.println("divide = " + divide);

    }
}
