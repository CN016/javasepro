package com.my016.fileAndio_Learn;

import java.io.FileInputStream;
import java.io.InputStream;

public class IOStream {
    public static void main(String[] args) throws Exception{
        InputStream  inputStream = new FileInputStream("lib/data.txt");
//        int temp = inputStream.read();
//        System.out.println(temp);
//        System.out.println((char) temp);
        int b;
        while ((b=inputStream.read())!= -1){
            System.out.println(b);
        }
    }
}
