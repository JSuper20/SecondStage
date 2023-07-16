package com.damahou.day04.exception;

/**
 * @Program SecondStage
 * @ClassName ExceptionDemo08
 * @Package com.damahou.day04.exception
 * @Description Exception
 * @Author DaMaHou
 * @CreateDate 2023-07-16 12:28
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class ExceptionDemo08 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[]{1, 2, 3, 4, 5};
            System.out.println(arr[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("hhhhhhhhh");
    }
}
