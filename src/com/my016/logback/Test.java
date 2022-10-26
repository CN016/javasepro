package com.my016.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//搭建LogBack日志框架
public class Test {
    //创建LogBack的日志对象
    public static final   Logger LOGGER =  LoggerFactory.getLogger("Test.class");

    public static void main(String[] args) {
       while (true){
           LOGGER.debug("main开始运行了~~~~");
           LOGGER.info("第二行日志");

           try {
               int a = 10;
               int b = 0;
               LOGGER.trace("a="+a);
               LOGGER.trace("b="+b);

               System.out.println( a / b );
           } catch (Exception e) {
               e.printStackTrace();
               LOGGER.error("功能出现异常"+e);
           }

       }
    }
}
