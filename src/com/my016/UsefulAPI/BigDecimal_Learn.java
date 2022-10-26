package com.my016.UsefulAPI;

import java.math.BigDecimal;

public class BigDecimal_Learn {
    public static void main(String[] args) {
//浮点型运算会失真，因此用该类可解决
        double d1=0.1;
        double d2=0.2;
        double d3=d1+d2;
        System.out.println(d3);

        //包装浮点型数据成大数据对象
        BigDecimal a1 = BigDecimal.valueOf(d1);
        BigDecimal a2 = BigDecimal.valueOf(d2);
        BigDecimal a3 = a1.add(a2);
        System.out.println(a3);
    }
}
