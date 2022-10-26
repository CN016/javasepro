package com.my016.UsefulAPI;
//可变字符串类，也可以看成对象容器
public class StringBuilder_learn {
    public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
            sb.append("a");
            sb.append("b");
            sb.append("c");
            sb.append(true);
            sb.append(114);
            sb.append(5.114);  //性能好于String +  
        System.out.println(sb);
    }
}
