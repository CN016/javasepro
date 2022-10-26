package com.my016.USB_SYSTEM;

public class Mouse implements USB{
    private String name;

    @Override
    public void connect() {
        System.out.println("鼠标"+name+"成功连接电脑~");
    }

    @Override
    public void unConnect() {
        System.out.println("鼠标"+name+"成功拔出电脑~");
    }

    public void mouseClick(){
        System.out.println("接受到鼠标输入信号~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mouse(String name) {
        this.name = name;
    }

    public Mouse() {
    }
}
