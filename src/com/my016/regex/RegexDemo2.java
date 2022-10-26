package com.my016.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        String rs = "来黑马程序学习Java,电020-43422424，或者联系邮箱"+
        "itcast@itcast.cn,电话18762832633，0203232323"+
                "邮箱bozai@itcast.cn，400-100-3233 , 4001003232";
        //盂求:从上面的内容中爬取出电话号码和邮箱。

        String regex="(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}) | " +
                "(1[13-9]\\d{5}\\d*) | " +
                "(0\\d{2,6}-?\\d{5,20}) | (400-?\\d{3,9}-?\\d{3,9})";
        //规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        //得到一个内容匹配器对象

        Matcher matcher = pattern.matcher(rs);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
      //  System.out.println(matcher.group());
    }
}
