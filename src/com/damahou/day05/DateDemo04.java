package com.damahou.day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @Program SecondStage
 * @ClassName DateDemo04
 * @Package com.damahou.day05
 * @Description Date
 * @Author DaMaHou
 * @CreateDate 2023-07-16 17:15
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class DateDemo04 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = dateFormat.format(date);
        System.out.println(dateStr);
        Date parseDate = dateFormat.parse(dateStr);
        System.out.println(parseDate);
        System.out.println("-------------------");

        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        System.out.println(timeInMillis);
        Date calendarDate = calendar.getTime();
        System.out.println(calendarDate);
        String calDateStr = dateFormat.format(calendarDate);
        System.out.println(calDateStr);
        Date calDate = dateFormat.parse(calDateStr);
        System.out.println(calDate);
        System.out.println("==============================");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        int nano = now.getNano();
        System.out.println(nano);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nowDateStr = formatter.format(now);
        System.out.println(nowDateStr);
        LocalDateTime localDateTime = LocalDateTime.parse(nowDateStr, formatter);
        System.out.println(localDateTime);

    }
}
