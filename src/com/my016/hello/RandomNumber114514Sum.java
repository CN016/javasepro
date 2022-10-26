package com.my016.hello;

import java.util.Random;

public class RandomNumber114514Sum {
    public static void main(String[] args) {
        Random ra =new Random();
        int under100=0,under1000=0,under10000=0,under100000=0,upper100000=0,temp;
        for (int i=1 ; i <= 114514 ; i++){
            temp=ra.nextInt(1919811);
            System.out.println(temp);
            if (temp<=100)
                under100++;
            else if (temp>100 && temp<=1000)
                under1000++;
            else if (temp>1000 && temp <=10000)
                under10000++;
            else if (temp>10000 && temp <=100000)
                under100000++;
            else if (temp>100000)
                upper100000++;
        }
        System.out.println("上面是随机生成的114514个随机数（0~1919810）");
        System.out.println("小于100的数有"+under100+"个！");
        System.out.println("大于100小于1000的数有"+under1000+"个！");
        System.out.println("大于1000小于10000的数有"+under10000+"个！");
        System.out.println("大于10000小于100000的数有"+under100000+"个！");
        System.out.println("大于100000的数有"+upper100000+"个！");
    }
}
