package com.my016.singleinstance;

public class SingleInstance2 {
    private SingleInstance2(){

    }

     private static SingleInstance2 instance ; // null

    public static SingleInstance2 getInstance(){
        if (instance == null){
            instance = new SingleInstance2();
        }
        return instance;
    }
}
