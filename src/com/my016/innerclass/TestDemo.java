package com.my016.innerclass;

public class TestDemo {
    public static void main(String[] args) {
    OuterDemo.Inner in = new OuterDemo().new Inner();
    in.setName("016");
    in.show();
    }
}
