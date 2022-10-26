package com.my016.javabean;

public class Test {
    public static void main(String[] args) {
        User u= new User();
        u.setHeight(114);
        u.setName("光头强");
        u.setSalary(1919810);
        System.out.println(u.getHeight());
        System.out.println(u.getName());
        System.out.println(u.getSalary());
    }
}
