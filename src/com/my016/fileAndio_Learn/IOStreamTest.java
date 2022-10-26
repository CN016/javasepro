package com.my016.fileAndio_Learn;

import java.io.FileInputStream;
import java.io.InputStream;

public class IOStreamTest {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = new FileInputStream("lib/data.txt");

        //读字节数组
//        byte[] buffer = new byte[3];
//        int len =   inputStream.read(buffer);
//        System.out.println(len);
//        String rs = new String(buffer);
//        System.out.println(rs);
        //循环读取
        byte[] buffer = new byte[3];
        int len;
        while ((len = inputStream.read(buffer)) != -1){
            System.out.println(new String(buffer,0,len));
        }
    }
}
