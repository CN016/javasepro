package com.my016.regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        //校验QQ号
        System.out.println(checkQQ("114514"));
        System.out.println(checkQQ("sdfbhaye28uu"));
        //正则表达式
        System.out.println(checkQQ2("114514"));
        System.out.println(checkQQ2("114514"));

    }

    public static boolean checkQQ2(String qq){
        return qq!=null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq){
        if(qq == null || qq.length()<6 || qq.length() >20){
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
                    if (ch<'0' || ch>'9'){
                        return false;
                    }
        }
        return true;

    }
}
