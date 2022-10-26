package com.my016.fileAndio_Learn;

import java.io.*;

public class ByteBufferDemo {
    public static void main(String[] args) {
        try {
            InputStream bis = new BufferedInputStream(new FileInputStream("lib/data.txt"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                System.out.println(new String(buffer,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
