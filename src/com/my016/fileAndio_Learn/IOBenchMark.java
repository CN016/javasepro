package com.my016.fileAndio_Learn;

import java.io.*;

public class IOBenchMark {
    private static final String SRC_FILE = "E:\\360Downloads\\Video\\4d702a78c8e74c5b8f58444c7dee90d5.mp4";
    private static final String DEST_FILE = "F:\\test\\";
    public static void main(String[] args) {
        copy1();
        copy2();
        copy3();
        copy4();
    }

    private static void copy4() {
        long startTime = System.currentTimeMillis();
        //缓冲流
        try {
            InputStream bis = new BufferedInputStream(new FileInputStream(SRC_FILE));
            byte[] buffer = new byte[1024];
            OutputStream bos = new BufferedOutputStream(new FileOutputStream(DEST_FILE+"3.mp4"));
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0+"s");
    }

    private static void copy3() {
        long startTime = System.currentTimeMillis();
        //缓冲流
        try {
            InputStream bis = new BufferedInputStream(new FileInputStream(SRC_FILE));
            //byte[] buffer = new byte[1024];
            OutputStream bos = new BufferedOutputStream(new FileOutputStream(DEST_FILE+"3.mp4"));
            int len;
            while ((len = bis.read()) != -1){
                bos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0+"s");
    }

    private static void copy2() {
        long startTime = System.currentTimeMillis();
        try {
            //低级字符流
            InputStream is = new FileInputStream(SRC_FILE);
            OutputStream os = new FileOutputStream(DEST_FILE+"2.mp4");
            byte[] buffer = new byte[1024];
            int b;
            while ((b=is.read(buffer)) !=-1 ){
                os.write(buffer,0,b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0+"s");

    }

    private static void copy1() {
        long startTime = System.currentTimeMillis();
        try {
            //低级字节流
            InputStream is = new FileInputStream(SRC_FILE);
            OutputStream os = new FileOutputStream(DEST_FILE+"1.mp4");
            int b;
            while ((b=is.read()) !=-1 ){
                os.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0+"s");
    }
}
