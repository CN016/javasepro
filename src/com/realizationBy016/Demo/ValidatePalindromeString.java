package com.realizationBy016.Demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePalindromeString {
    public static void main(String[] args) {
        System.out.println(new ValidatePalindromeStringSolution().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new ValidatePalindromeStringSolution().isPalindrome("race a car"));
    }
}
class ValidatePalindromeStringSolution {
    public boolean isPalindrome(String s) {
    String regex = "[A-Za-z0-9]",fina = "";
        //规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        //得到一个内容匹配器对象

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            fina += matcher.group();
        }
        fina  =   fina.toLowerCase();
        char[] chars =  fina.toCharArray();
        int late = chars.length;
        for (int i = 0; i<=late-1; i++ ,late--) {
            if ( chars[i] != chars[late-1] ){
                return false;
            }
        }

    return true;
    }
}