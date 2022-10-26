package com.my016.stream_Apply;

public class Employee {
    private String name ;
    private char sex;
    private double bonus;
    private String punish; // 处罚信息

    public Employee() {
    }

    public Employee(String name, char sex, double bonus, String punish) {
        this.name = name;
        this.sex = sex;
        this.bonus = bonus;
        this.punish = punish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPunish() {
        return punish;
    }

    public void setPunish(String punish) {
        this.punish = punish;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", bonus=" + bonus +
                ", punish='" + punish + '\'' +
                '}';
    }
}
