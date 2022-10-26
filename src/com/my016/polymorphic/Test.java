package com.my016.polymorphic;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.run();

        Animal animal2 = new Tortoise();
        animal2.run();
    }
}
