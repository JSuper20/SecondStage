package com.damahou.day04.array;

import java.io.File;

/**
 * @Program SecondStage
 * @ClassName FactorialDemo03
 * @Package com.damahou.day04.array
 * @Description Test
 * @Author DaMaHou
 * @CreateDate 2023-07-09 18:01
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class FactorialDemo03 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\JC_jiangchao\\Desktop\\PMP免考增持CSPM-2等级证书-材料准备");
        traverseDirectory(file);
    }

    /**
     * 递归遍历文件夹
     *
     * @param file file
     */
    private static void traverseDirectory(File file) {
        if (file.isDirectory()) {
            System.out.println("文件夹：" + file.getAbsolutePath());
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    traverseDirectory(f);
                }

            }
        } else {
            System.out.println("文件：" + file.getAbsolutePath());
        }
    }
}
