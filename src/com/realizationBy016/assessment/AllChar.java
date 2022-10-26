package com.realizationBy016.assessment;

//import javax.accessibility.AccessibleStateSet;
import java.util.Scanner;

public class AllChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new AllCharSolution().result(sc.next());
    }
}
class AllCharSolution{
    public void result(String s){
        char[] str = s.toCharArray();
        int charNum = 0;
        int numNum = 0;
        int spaceNum = 0;
        int otherNum = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'a' && str[i] <='z' || str[i] >='A' && str[i] <='Z' ){
                charNum++;
            }else if ( str[i] >= '0' && str[i] <='9'  ){
                numNum++;
            }else if ( str[i] == ' ' ){
                spaceNum++;
            }else {
                otherNum++;
            }
        }
        System.out.println( "charNum:"+charNum );
        System.out.println( "numNum :"+numNum  );
        System.out.println( "spaceNum:"+spaceNum );
        System.out.println( "otherNum:"+otherNum );
    }
}
