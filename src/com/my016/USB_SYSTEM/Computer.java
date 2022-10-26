package com.my016.USB_SYSTEM;

public class Computer {
    private String name;

    public void boot(){
        System.out.println(name+"开机了~~");
    }
    //安装USB设备
    public void installUSB(USB usb){

        usb.connect();

        if (usb instanceof KeyBord){
            KeyBord k = (KeyBord) usb;
            k.keyDown();
        } else if(usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.mouseClick();

        }

        usb.unConnect();


        
    }






    ////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {
    }
}
