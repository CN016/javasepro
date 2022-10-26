package com.my016.fileAndio_Learn;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_Learn {
    public static void main(String[] args) {
        //对象序列化
        Student s = new Student("016","114514","1919810",19);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lib/ObjectOutputStream_Learn_Result.txt"));

            oos .writeObject(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
