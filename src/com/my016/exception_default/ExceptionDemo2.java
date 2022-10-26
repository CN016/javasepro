package com.my016.exception_default;
//运行时异常处理
public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            chu(10,0);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("除数为0");
        }
    }
    public static void chu(int a, int b){
        System.out.println(a);
        System.out.println(b);
        System.out.println(a / b);
    }
}
