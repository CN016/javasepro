package com.my016.genericity_class;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());

        go(benzs);
    }

    public static void go(ArrayList<? extends Car> cars){

    }
}

class BENZ extends Car {

}
class BWM extends Car {

}
class  Car {

}