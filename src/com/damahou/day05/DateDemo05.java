package com.damahou.day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Program SecondStage
 * @ClassName DateDemo05
 * @Package com.damahou.day05
 * @Description Date
 * @Author DaMaHou
 * @CreateDate 2023-07-16 17:48
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class DateDemo05 {
    public static void main(String[] args) throws ParseException {
        //开始时间：2020年11月11日 0:0:0
        //结束时间：2020年11月11日 0:10:0

        //小贾2020年11月11日 0:03:47
        //小皮2020年11月11日 0:10:11

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startTime = sdf.parse("2020年11月11日 0:0:0").getTime();
        long endTime = sdf.parse("2020年11月11日 0:10:0").getTime();
        System.out.println("startTime = " + startTime);
        System.out.println("endTime = " + endTime);

        long xjTime = sdf.parse("2020年11月11日 0:03:47").getTime();
        System.out.println("xjTime = " + xjTime);
        long xpTime = sdf.parse("2020年11月11日 0:10:11").getTime();
        System.out.println("xpTime = " + xpTime);

        if(xjTime >= startTime && xjTime <= endTime) {
            System.out.println("小贾秒杀成功");
        }
        if(xpTime >= startTime && xpTime <= endTime) {
            System.out.println("小皮秒杀成功");
        }
    }
}
