package com.my016.arrays_Learn;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //自定义数组排序规则，Comparator比较器对象
        //默认升序排序
        Integer[] arr = {1,1,4,5,1,4,1,9,1,9,8,1,0};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override //被排序数组必须是引用类型元素
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------------------");
        Student[] students = new Student[3];
        students[0] = new Student("016" ,19 ,188);
        students[1] = new Student("017" ,17 ,168);
        students[2] = new Student("018" ,13 ,158);

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()- o2.getAge();//年龄升序
            }
        });

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        });

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(),o2.getHeight());//升序    //浮点型比较大小
            }
        });

        System.out.println(Arrays.toString(students));
    }
}
