package com.damahou.day04.api;

import java.time.Instant;
import java.util.Arrays;

/**
 * @Program SecondStage
 * @ClassName SystemDemo
 * @Package com.damahou.day04.api
 * @Description System类方法的使用
 * @Author DaMaHou
 * @CreateDate 2023-07-08 15:32
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class SystemDemo {
    public static void main(String[] args) {
        // public static void exit(int status)	终止当前运行的 Java 虚拟机，非零表示异常终止
        /*System.out.println("111111");
        System.exit(0);*/

        /*
         * 在控制台输出1-10000，计算这段代码执行了多少毫秒
         */
        long s = Instant.now().getNano();
        // public static long currentTimeMillis()  返回当前时间(以毫秒为单位)
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        long e = Instant.now().getNano();
        System.out.println("共用时：" + (endTime - startTime));
        System.out.println("共用时：" + (e - s));

        // arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数)	数组copy
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[10];
        //需求:我要把a中的数据拷贝到b中
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));
        //我要把a最后两个元素,拷贝到b的最后两个索引上
        System.arraycopy(a, 3, b, 8, 2);
        System.out.println(Arrays.toString(b));
    }
}
