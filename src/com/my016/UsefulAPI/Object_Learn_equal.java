package com.my016.UsefulAPI;

public class Object_Learn_equal {
    public static void main(String[] args) {
        Student s1 = new Student("016",19,'男');
        Student s2 = new Student("016",19,'男');
        System.out.println(s1.equals(s2));

    }
}
