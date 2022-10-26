package com.my016.UsefulAPI;

import java.util.Arrays;

public class System_Learn {
    public static void main(String[] args) {
        System.out.println("程序开始~~");
       // System.exit(0) ;  //JVM终止

        long time = System.currentTimeMillis();
        System.out.println(time);

        //输出时间

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("输出："+i);
        }
        long endTime =System.currentTimeMillis();
        System.out.println(endTime - startTime);

        //ArrayCopy
//        arraycopy(Object src,  int  srcPos,
//        Object dest, int destPos,
//        int length);

        int[] arr1 = {1,1,4,5,1,4,1,9,1,9,8,1,0};
        int[] arr2 = new int[10];

        System.arraycopy(arr1,6,arr2,1,5);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
