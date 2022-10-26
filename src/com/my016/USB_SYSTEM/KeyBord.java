package com.my016.USB_SYSTEM;

public class KeyBord implements USB{
    private String name;

    @Override
    public void connect() {
        System.out.println("键盘"+name+"成功连接电脑~");
    }

    @Override
    public void unConnect() {
        System.out.println("键盘"+name+"成功拔出电脑~");
    }

    public void keyDown(){
        System.out.println("接受到键盘输入信号~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeyBord(String name) {
        this.name = name;
    }

    public KeyBord() {
    }
}
