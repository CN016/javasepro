package com.my016.extends_;

public class People extends Date{
    private String name ;
    private String ID ;
    private int age ;

    public People() {
    }

    public People(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public People(int year, int month, int day, String name, String ID, int age) {
        super(year, month, day);
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
