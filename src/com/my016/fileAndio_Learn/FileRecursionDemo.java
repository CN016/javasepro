package com.my016.fileAndio_Learn;

import java.io.File;

public class FileRecursionDemo {
    public static void main(String[] args) {
    searchFile(new File("E:/"),"ali213Pk.exe");
    }

    /**
     *搜索某个目录的文件，找到想要的文件
     * @param dir  源目录
     * @param fileName 文件名
     */
    public static void searchFile (File dir,String fileName){
        //判断dir是否是目录
        if (dir!=null && dir.isDirectory()){
            File[] files = dir.listFiles(); //null []
            if (files != null && files.length >0){
                for (File file : files) {
                    if (file.isFile()){
                        if (file.getName().contains(fileName)){
                            System.out.println("找到其路径："+file.getAbsolutePath());
                        }
                    }else {
                        //说明是文件夹
                        searchFile(file,fileName);
                    }
                }
            }
        }else {
            System.out.println("当前目录不是文件夹或者驱动器，不支持查找QAQ~~");
        }
    }
}
