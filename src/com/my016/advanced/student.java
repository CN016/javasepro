package com.my016.advanced;

public class student {

/////////////////////////////////////////////////////////////////////////////////////
    private   String name;

    private  String studentID;

    private  int age;

    private  String className;
/////////////////////////////////////////////////////////////////////////////////////

    public student() {
    }

    public student(String name, String studentID, int age, String className) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
