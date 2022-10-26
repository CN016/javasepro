package com.my016.otherObject;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            arrayList.add(sc.nextInt());
        }
        int count=0,max=0;
        ////////////////////////////A1///////////////////////////////

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 3 ==0  && arrayList.get(i)>max )
                max=arrayList.get(i);
        }
        if (max==0){
            System.out.print("NONE ");
        }
        else {
            System.out.print(max+" ");
        }
     /////////////////////////////////A2//////////////////////////////////////

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 1,k=1; k <= arrayList.get(i); j++) {
               // System.out.print(k+" ");
                if (arrayList.get(i) == k){
                    count++;
                }
                k=3*j+1;

            }
        }

        if (count==0){
            System.out.print("NONE ");
        }
        else {
            System.out.print(count+" ");
        }
        /////////////////////////////////A3//////////////////////////////////////
        count=0; int sum=0; double A3=0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 1,k=2; k <= arrayList.get(i); j++) {

                if (arrayList.get(i) == k){
                    count++;
                    sum+=k;
                    A3=1.0*sum/count;
                }
                k=3*j+2;

            }
        }
        if(A3!=0){
            System.out.println(A3);
        }else {
            System.out.println("NONE");
        }

    }
}
