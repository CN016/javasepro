package com.my016.advanced;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class TryStringDemo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Name ="016";
        String Password="abc016016";
        System.out.print("用户名：");
        String name=sc.next();
        System.out.print("密码：");
        String password=sc.next();
        if (Name.equals(name) && Password.equals(password)){
            System.out.println("登陆成功！");
        }
        else {
            System.out.println("用户名或密码错误");
        }
    }
}
