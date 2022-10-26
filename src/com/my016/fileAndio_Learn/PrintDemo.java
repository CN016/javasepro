package com.my016.fileAndio_Learn;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintDemo {
    public static void main(String[] args) throws Exception{
        System.out.println("114514");
        System.out.println("1919810");

        PrintStream ps = new PrintStream("lib/PrintDemoResult.txt");
        System.setOut(ps);

        System.out.println("114514");
        System.out.println("1919810");

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out))); //恢复控制台输出

        System.out.println("114514");
        System.out.println("1919810");

    }
}
