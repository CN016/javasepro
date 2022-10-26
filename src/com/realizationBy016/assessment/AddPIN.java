package com.realizationBy016.assessment;

public class AddPIN {
    public static void main(String[] args) {

        new AddPINSolution().process("a2bc3d".toCharArray(),3);
    }
}
class AddPINSolution{
    public void process ( char[] str ,int n){
        for (int i = 0; i < str.length; i++) {
            if ( str[i] >='a' && str[i] <='z' || str[i] >='A' && str[i] <='Z' )
            if ( str[i] + n > 'z' ){
               str[i] = (char) (str[i] -26 + n);
            }else {
              str[i] = (char) (str[i]+n);

            }
            System.out.print(str[i]);
        }
    }
}
