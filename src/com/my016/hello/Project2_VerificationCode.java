package com.my016.hello;

import java.util.Random;
import java.util.Scanner;

public class Project2_VerificationCode {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("随机生成验证码的位数：");
        int n=sc.nextInt();
        System.out.println("The code:"+random(n));
    }
    public static String random (int number){
    String st ="";
    Random r =new Random();
        for (int i = 0; i < number; i++) {
            int type=r.nextInt(3);
            switch (type) {
                case 0 -> {
                    char ch = (char) (r.nextInt(26) + 65);//(A 65 ~  Z)
                    st += ch;
                }
                case 1 -> {
                    char ch1 = (char) (r.nextInt(26) + 97);//(a 65 ~  z)
                    st += ch1;
                }
                case 2 -> st += r.nextInt(10);
            }

        }
        return st;
    }
}
