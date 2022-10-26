package com.my016.set;

import java.util.Objects;

public class Apple implements Comparable<Apple>{
    private String name;
    private String color;
    private double weight;
    private double price;

    public Apple() {
    }

    public Apple(String name, String color, double weight, double price) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}'+'\n';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Double.compare(apple.weight, weight) == 0 && Double.compare(apple.price, price) == 0 && Objects.equals(name, apple.name) && Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight, price);
    }

    @Override
    public int compareTo(Apple o) {
        return (int)(this.price - o.price)*100000 ;
    }
}
