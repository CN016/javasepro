package com.my016.exception_default;

import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            {
                System.out.println("输入合法的价格：");
                String priceStr = sc.nextLine();
                double price = 0;
                try {
                    price = Double.valueOf(priceStr);
                } catch (NumberFormatException e) {
                    //e.printStackTrace();
                    System.out.println("输入数据不正确");
                    break;
                }

                if (price > 0) {
                    System.out.println("价格：" + price);
                    break;
                } else {
                    System.out.println("必须是正数");
                }
            }
        }
    }
}
