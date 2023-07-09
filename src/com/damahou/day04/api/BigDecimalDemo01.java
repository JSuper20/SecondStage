package com.damahou.day04.api;

import java.math.BigDecimal;

/**
 * @Program SecondStage
 * @ClassName BigDecimalDemo01
 * @Package com.damahou.day04.api
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 13:58
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class BigDecimalDemo01 {
    public static void main(String[] args) {
        System.out.println(10.0 / 3.0);

        BigDecimal b1 = new BigDecimal(10.0);
        BigDecimal b2 = new BigDecimal(3.0);
        // java.lang.ArithmeticException: Non-terminating decimal expansion;
        // System.out.println(b1.divide(b2));

        /*
         *   BigDecimal.ROUND_UP  进一法
         *   BigDecimal.ROUND_FLOOR 去尾法
         *   BigDecimal.ROUND_HALF_UP 四舍五入
         */
        BigDecimal divide = b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(divide);

    }
}
