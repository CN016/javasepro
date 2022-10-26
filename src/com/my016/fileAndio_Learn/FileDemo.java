package com.my016.fileAndio_Learn;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class FileDemo {
    public static void main(String[] args) {
        //定位操作系统文件
        File f = new File("E:\\file\\2022年科协二招文件.zip"); //绝对路径
        System.out.println(f.length());
        //支持绝对路径和相对路径
        File f1 = new File("lib/data.txt");
        System.out.println(f1.length());
        //文件或者文件夹
        System.out.println(f.getAbsolutePath());
        System.out.println(f1.getAbsolutePath());

        long time =  f1.lastModified();
        System.out.println("最后修改时间：" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));


    }
}
