package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName InterfaceA
 * @Package com.damahou.day03.inters
 * @Description InterfaceA
 * @Author DaMaHou
 * @CreateDate 2023-07-02 16:17
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public interface InterfaceA {

    public default void start() {
        System.out.println("start方法执行了...");
        // System.out.println("日志记录 ( 模拟 )");
        log();
    }

    public default void end() {
        System.out.println("end方法执行了...");
        // System.out.println("日志记录 ( 模拟 )");
        log();
    }

    private void log() {
        System.out.println("日志记录 ( 模拟 )");
    }

    private static void check() {
        System.out.println("权限校验（模拟）");
    }

    public static void open() {
        check();
        // System.out.println("权限校验（模拟）");
        System.out.println("open方法执行了");
    }

    public static void close() {
        check();
        // System.out.println("权限校验（模拟）");
        System.out.println("close方法执行了");
    }
}
