package com.damahou.day05;

import java.time.Instant;
import java.util.Date;

/**
 * @Program SecondStage
 * @ClassName DateDemo01
 * @Package com.damahou.day05
 * @Description Date
 * @Author DaMaHou
 * @CreateDate 2023-07-16 14:40
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class DateDemo01 {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(0L);
        System.out.println(date2);

        Date date3 = new Date(3600L * 1000);
        System.out.println(date3);

        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        long nanoTime = System.nanoTime();
        System.out.println(nanoTime);

        Instant now = Instant.now();
        long epochSecond = now.getEpochSecond();
        System.out.println(epochSecond);
        int nano = now.getNano();
        System.out.println(nano);
    }
}
