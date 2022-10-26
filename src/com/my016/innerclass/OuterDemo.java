package com.my016.innerclass;
//外部类
public class OuterDemo {
    public static int number = 1919810;
  //  private String


    //不能加static
    public class Inner {
        private String name;
        private int age;
        public static int a ;

        public void show(){
            System.out.println("名字"+name);
        }

        public static void test(){

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

        public static int getA() {
            return a;
        }

        public static void setA(int a) {
            Inner.a = a;
        }
    }
}
