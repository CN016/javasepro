package com.my016.advanced;

import java.util.Random;
import java.util.Scanner;

public class TryStringDemo5ForVerificationCode {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random r=new Random();
        int n=r.nextInt(6)+5;
        TryStringDemo5ForVerificationCode rs = new TryStringDemo5ForVerificationCode();
        String creatRandomCode= rs.randomForVerificationCode(n);
        System.out.println("The random code:"+creatRandomCode);
        System.out.println("请输入验证码");
        String inputCode=sc.next();
        if (inputCode.equalsIgnoreCase(creatRandomCode)){
            System.out.println("Right!");
        }
        else{
            System.out.println("Error!");
        }
    }
    public  String randomForVerificationCode (int number){
         String ts ="";
        int i,pe;
         Random r =new Random();
        for ( i = 0; i < number; i++) {
            pe=r.nextInt(3);
            switch (pe) {
                case 0 : {
                    char ch = (char) (r.nextInt(26) + 65);//(A 65 ~  Z)
                    ts += ch;
                    break;
                }
                case 1 : {
                    char ch1 = (char) (r.nextInt(26) + 97);//(a 65 ~  z)
                    ts += ch1;
                    break;
                }
                case 2 : ts += r.nextInt(10);
                break;
            }

        }
        return ts;
    }
}
