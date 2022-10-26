package com.my016.genericity_class;

public class GenericDemo {
    public static void main(String[] args) {
        String[] names = {"鬼武","鬼舞","鬼雾","贵物"};
        Integer[] ages = {11,41,51,4};
        printArray(ages);
    }

    public static <T> void printArray(T[] arr){

        if ( arr != null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i== arr.length-1 ? "" :",");
            }
            sb.append("]");
            System.out.println(sb);
        }else {
            System.out.println(arr);
        }
    }
}
