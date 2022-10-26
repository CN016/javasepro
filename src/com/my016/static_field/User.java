package com.my016.static_field;

public class User {
    public static int onlineNumber ;

    private String name;

    private int age;

    public static void main(String[] args) {
        User.onlineNumber++;
        System.out.println(User.onlineNumber);

        User us = new User();
        us.age++;
        System.out.println(us.age);
        us.onlineNumber++;
        System.out.println(us.onlineNumber);
        System.out.println(onlineNumber);



    }
}
