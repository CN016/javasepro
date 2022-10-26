package com.my016.fileAndio_Learn;

import java.util.Arrays;

public class IO_Code {
    public static void main(String[] args) {
        String name = "我是个鸡巴";
        byte[] bytes = name.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
