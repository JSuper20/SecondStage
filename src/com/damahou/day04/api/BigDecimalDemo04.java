package com.damahou.day04.api;

import java.math.BigDecimal;

/**
 * @Program SecondStage
 * @ClassName BigDecimalDemo04
 * @Package com.damahou.day04.api
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 15:31
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class BigDecimalDemo04 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("0.3");
        BigDecimal b2 = new BigDecimal("4");

        // java.lang.ArithmeticException: Non-terminating decimal expansion;
        // BigDecimal divide = b1.divide(b2);
        // 参数一:表示参数运算的另一个对象
        // 参数二:表示小数点后精确到多少位
        // 参数三:舍入模式
        //        进一法  BigDecimal.ROUND_UP
        //        去尾法  BigDecimal.ROUND_FLOOR
        //        四舍五入 BigDecimal.ROUND_HALF_UP
        BigDecimal divide = b1.divide(b2, 2, BigDecimal.ROUND_UP);
        System.out.println(divide);
        BigDecimal divide1 = b1.divide(b2, 2, BigDecimal.ROUND_FLOOR);
        System.out.println(divide1);
        BigDecimal divide2 = b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(divide2);

    }
}
