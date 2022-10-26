package com.my016.fileAndio_Learn;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws Exception{
        //创建字节输入流

        InputStream inputStream = new FileInputStream("E:\\360Downloads\\Video\\4d702a78c8e74c5b8f58444c7dee90d5.mp4");


        OutputStream outputStream = new FileOutputStream("E:\\360MoveData\\Users\\mi\\114514.mp4");

        byte[] bytes = new byte[1024];

        int len;
        while ((len = inputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        outputStream.close();
        inputStream.close();
    }
}
