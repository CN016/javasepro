package com.my016.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student s1 = new Student("016",19,'N');
        Student s0 = new Student("016",19,'N');
        Student s2 = new Student("013",19,'F');
        Student s3 = new Student("017",9,'N');
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s0);

        System.out.println(students);
    }
}
