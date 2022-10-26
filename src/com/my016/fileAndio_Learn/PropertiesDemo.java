package com.my016.fileAndio_Learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
        //使用Properties把键值对信息存到属性文件中
        Properties properties =new Properties();
        properties.setProperty("admin","123456");
        properties.setProperty("root","123456");
        System.out.println(properties);

        properties.store(new FileWriter("lib/PropertiesDemoResult.properties"),"114514");

        Properties properties1 = new Properties();
        properties1.load(new FileInputStream("lib/PropertiesDemoResult.properties"));
        System.out.println(properties1);

    }
}
