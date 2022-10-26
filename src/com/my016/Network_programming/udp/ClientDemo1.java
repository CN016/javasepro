package com.my016.Network_programming.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * 发送端
 */
public class ClientDemo1 {
    //发送端对象
    //DatagramSocket socket =new DatagramSocket();
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket();

        //创建数据包对象
//        buf——数据包数据。
//        offset – 数据包数据偏移量。长度——数据包数据长度。
//        address - 目标地址，或 null。
//        port - 目标端口号。
        //public DatagramPacket(byte buf[], int offset, int length,
        //                          InetAddress address, int port)
        byte[] buffer = "114514 || 1919810".getBytes(StandardCharsets.UTF_8);
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(),8888);

        socket.send(packet);
    }
}
