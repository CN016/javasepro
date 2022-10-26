package com.my016.hello;

public class PaperZhedie {
    public static void main(String[] args) {
        int count=0;
        double high =0.1;
        while (high<=8848860)
        {
            high*=2; count++;
        }
        System.out.println("一张纸（厚度0.1mm）需要折叠"+count+"次才能达到珠穆朗玛峰的高度");

    }
}
