package com.damahou.day05;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @Program SecondStage
 * @ClassName DateDemo03
 * @Package com.damahou.day05
 * @Description Date
 * @Author DaMaHou
 * @CreateDate 2023-07-16 15:37
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class DateDemo03 {
    public static void main(String[] args) {
        // 使用 Date 获取时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
        long time = date.getTime();
        System.out.println(time);
        System.out.println("_______________________");

        // Calendar 获取时间
        Calendar c = Calendar.getInstance();
        Date cDate = c.getTime();
        System.out.println(cDate);
        String cDateStr = sdf.format(cDate);
        System.out.println(cDateStr);
        long cDateTime = cDate.getTime();
        System.out.println(cDateTime);
        System.out.println("_______________________");

        LocalDateTime localDateTime = LocalDateTime.now();
        int nano = localDateTime.getNano();
        System.out.println(nano);
        Instant now = Instant.now();
        int nowNano = now.getNano();
        System.out.println(nowNano);
        long epochSecond = now.getEpochSecond();
        System.out.println(epochSecond);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String localDateTimeStr = dtf.format(localDateTime);
        System.out.println(localDateTimeStr);
    }
}
