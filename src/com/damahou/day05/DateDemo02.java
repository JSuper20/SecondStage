package com.damahou.day05;

import java.util.Date;

/**
 * @Program SecondStage
 * @ClassName DateDemo02
 * @Package com.damahou.day05
 * @Description DateTime
 * @Author DaMaHou
 * @CreateDate 2023-07-16 15:16
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class DateDemo02 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        long l = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(time == l);

        Date date1 = new Date();
        date1.setTime(0L);
        System.out.println(date1);
    }
}
