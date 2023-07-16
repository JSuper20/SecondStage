package com.damahou.day04.exception;

/**
 * @Program SecondStage
 * @ClassName ExceptionDemo05
 * @Package com.damahou.day04.exception
 * @Description Exception
 * @Author DaMaHou
 * @CreateDate 2023-07-16 11:34
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ExceptionDemo05 {
    public static void main(String[] args) {
        System.out.println("家里有一个貌美如花的老婆");
        System.out.println("还有一个当官的兄弟");
        System.out.println("自己还有一个买卖");
        System.out.println("这样的生活你要不要");

        // 当代码执行到这里，就创建一个异常对象，抛出异常，终止代码继续运行
        throw new RuntimeException();
        // 无法访问的语句
        // System.out.println("武大郎的标准生活");
    }
}
