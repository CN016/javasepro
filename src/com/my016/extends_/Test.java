package com.my016.extends_;

public class Test {
    public static void main(String[] args) {
        //创建类
        Student s = new Student();
        s.setYear(2003);
        s.setMonth(1);
        s.setDay(9);
        s.setName("016");
        s.setID("114514 ~ 1919810");
        s.learn();
        s.setAge(2022 - s.getYear() );

        System.out.println("age:"+s.getAge());
    }
}
