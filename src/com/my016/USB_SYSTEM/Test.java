package com.my016.USB_SYSTEM;

public class Test {
    public static void main(String[] args) {
    //创建电脑对象
        Computer c = new Computer("016");
        c.boot();


        //创建鼠标键盘对象
        USB keyboard = new KeyBord("114514");
        c.installUSB(keyboard);
        USB mouse = new Mouse("1919810");
        c.installUSB(mouse);
    }
}
