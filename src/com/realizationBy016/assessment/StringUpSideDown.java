package com.realizationBy016.assessment;

public class StringUpSideDown {
    public static void main(String[] args) {
        String str = "www.freecplus.net";
        System.out.println(new StringUpSideDownSolution().process(str));
    }
}
class StringUpSideDownSolution{
    public String  process(String s){
        char[] str = s.toCharArray();
        int left = 0 ;
        int right = str.length-1;
        while (left<=right){
            char temp = str[right];
            str[right] = str[left];
            str[left] = temp;
            left++;
            right--;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();

    }
}
