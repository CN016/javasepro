package com.my016.interface_test;

public class Test {
    public static void main(String[] args) {
        SportManImplement s = new SportManImplement();
        s.setName("016");
        System.out.println(s.getName());
        s.rule();
        s.run();
        s.eat();
        s.competition();
    }
}
