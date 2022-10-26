package com.my016.static_field;

import java.util.Random;

public class VerificationCode {
    private VerificationCode(){
    }

    public static String randomForVerificationCode (int number){
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
