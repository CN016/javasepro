package com.my016.Network_programming;

import java.net.InetAddress;

public class InternetAddressDemo1 {
    public static void main(String[] args) throws Exception{
        InetAddress ip1 = InetAddress.getLocalHost(); //本机地址
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());



    }
}
