package com.my016.fileAndio_Learn;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStream_Learn {
    public static void main(String[] args) throws Exception{
        //对象反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lib/ObjectOutputStream_Learn_Result.txt"));

        Student s = (Student) ois.readObject();

        System.out.println(s);

    }
}
