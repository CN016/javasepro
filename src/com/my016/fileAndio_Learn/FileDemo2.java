package com.my016.fileAndio_Learn;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;

public class FileDemo2 {
    public static void main(String[] args) {
       // File file = new File("E:\\360Downloads\\acc_installer_1.1.10.2.exe");

        //创建一级目录

        //File f2 = new File("E:\\360Downloads\\333\\222\\111\\000");
       // System.out.println(f2.mkdirs());

        //System.out.println(f2.delete());
        File f1 = new File("E:/");
        String[] names = f1.list();
        System.out.println(Arrays.toString(names));

        File[] files = f1.listFiles();
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
