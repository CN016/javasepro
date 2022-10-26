package com.my016.hello;

import java.util.Scanner;

public class daysprocess {
    public static void main(String[] args) {
        System.out.println("输入月份来计算该月份的天数：");
        Scanner sc= new Scanner(System.in);
        int month=sc.nextInt();
        if (month == 2)
        {
            System.out.println("请问是多少年的2月：");
            int year=sc.nextInt();
            if ( (year % 4 == 0 && year % 100 !=0) || year % 400 ==0 )
                System.out.println(month+"月是29天");
            else
                System.out.println(month+"月是28天");
        }
        else
        {
            switch (month){
                case 1 : System.out.println(month+"月是31天"); break;
                case 3 : System.out.println(month+"月是31天"); break;
                case 4 : System.out.println(month+"月是30天"); break;
                case 5 : System.out.println(month+"月是31天"); break;
                case 6 : System.out.println(month+"月是30天"); break;
                case 7 : System.out.println(month+"月是31天"); break;
                case 8 : System.out.println(month+"月是31天"); break;
                case 9 : System.out.println(month+"月是30天"); break;
                case 10 : System.out.println(month+"月是31天"); break;
                case 11 : System.out.println(month+"月是30天"); break;
                case 12 : System.out.println(month+"月是31天"); break;
            }

        }
    }
}
