package com.my016.MoveSystem.bean;

//import com.my016.genericity_class.Date;

import java.util.Date;

public class Movie {
    private String name;    //名字
    private String actor;   //主要演员
    private double score;   //分数
    private double price;  //价格
    private int    number; //余票
    private double   allTime;
    private Date   startTime;//放映时间

    public Movie() {
    }

//    public Movie(String name, String actor, double score, double price, int number, Date startTime) {
//        this.name = name;
//        this.actor = actor;
//        this.score = score;
//        this.price = price;
//        this.number = number;
//        this.startTime = startTime;
//    }


//    public Movie(String name, String actor, double score, double price, int number, Date allTime, Date startTime) {
//        this.name = name;
//        this.actor = actor;
//        this.score = score;
//        this.price = price;
//        this.number = number;
//        this.allTime = allTime;
//        this.startTime = startTime;
//    }

//    public Date getAllTime() {
//        return allTime;
//    }
//
//    public void setAllTime(Date allTime) {
//        this.allTime = allTime;
//    }


    public Movie(String name, String actor, double price, int number, double allTime, Date startTime) {
        this.name = name;
        this.actor = actor;
        //this.score = score;
        this.price = price;
        this.number = number;
        this.allTime = allTime;
        this.startTime = startTime;
    }

    public double getAllTime() {
        return allTime;
    }

    public void setAllTime(double allTime) {
        this.allTime = allTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
