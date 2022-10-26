package com.my016.fileAndio_Learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class IOStreamDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("lib/data.txt");
        InputStream is = new FileInputStream(file);
       // long len = file.length();
        byte[] buffer = new byte[(int)file.length()];
        int len =    is.read(buffer);
        System.out.println("字节："+len);
        System.out.println("文件大小："+file.length());
        System.out.println(new String(buffer));
    }
}
