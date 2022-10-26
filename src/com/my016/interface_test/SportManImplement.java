package com.my016.interface_test;

public class SportManImplement implements SportManInterface, Law {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SportManImplement(String name) {
        this.name = name;
    }

    public SportManImplement() {
    }

    @Override
    public void run() {
        System.out.println("开始跑步训练");
    }

    @Override
    public void competition() {
        System.out.println("参加比赛");
    }

    @Override
    public void eat() {
        System.out.println("吃营养餐");
    }

    @Override
    public void rule() {
        System.out.println("必须遵守法律");
    }


}
