package com.my016.advanced;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Aggregate_Demo6_StudentMessageAdministration {
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<>();
        /*
        "叶孤诚"，“20180302”，23，“护理一班”
       "东方不败","20180303",23,"推拿二班"
       "西门吹雪","20180304",26,"中药学四班"
        "梅朝凤","20180305",26,"神经科二班"
         */
        students.add(new student("叶孤诚","20180302",23,"护理一班"));
        students.add(new student("东方不败","20180303",23,"推拿二班"));
        students.add(new student("西门吹雪","20180304",26,"中药学四班"));
        students.add(new student("梅朝凤","20180305",26,"神经科二班"));

        //输出学生信息
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%5s \t %10s \t %6s \t %8s\n","名字","学号","年龄","班级名称");
        System.out.println("--------------------------------------------------------------");

        //System.out.printf("%5s \t %10s \t %3d \t %8s\n",    );

        for (int i = 0; i < students.size(); i++) {
            System.out.printf("%5s \t %10s \t %3d \t %8s\n"
                    ,students.get(i).getName(),students.get(i).getStudentID(),students.get(i).getAge()
            ,students.get(i).getClassName());
            System.out.println("--------------------------------------------------------------");
        }
        Scanner sc = new Scanner(System.in);
        //搜索学生对象信息

        while (true){
            System.out.print("请输入学生相关信息（名字或ID）来查找信息(输入114514退出):");
            String s =sc.next();
            if (s.equals("114514")){
                break;
            }
            student stu = searchStudentMessage(s,students);
            if (stu != null){
                System.out.println("--------------------------------------------------------------");
                System.out.printf("%5s \t %10s \t %6s \t %8s\n","名字","学号","年龄","班级名称");
                System.out.printf("%5s \t %10s \t %3d \t %8s\n"
                        ,stu.getName(),stu.getStudentID(),stu.getAge()
                        ,stu.getClassName());
                System.out.println("--------------------------------------------------------------");
            }


        }

    }
     public static student searchStudentMessage(String ID,ArrayList<student> students){
        student temp =new student();
         for (int i = 0; i < students.size(); i++) {
             if (ID.equals(students.get(i).getStudentID())){
                 System.out.println("已寻找到该学生!");
                temp=students.get(i);
                 return temp;
             }
             if (ID.equals(students.get(i).getName())){
                 System.out.println("已寻找到该学生!");
                 temp=students.get(i);
                 return temp;
             }
         }
         System.out.println("未找到该学生");
         return null;

     }
}
