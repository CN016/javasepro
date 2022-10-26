package com.my016.innerclass;

public class Outer {
    public static int a = 114514;
    /*
     *
     *
     *
     *内部类
     *
     *
     */

    public static class Inner{
        private String name;
        private int age;
        public static String schoolName;

        public void show(){
            System.out.println("名字"+name);
            System.out.println(a);
        }

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }
    }

}
