package com.my016.fileAndio_Learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class OutStreamDemo {
    public static void main(String[] args) throws Exception{
        OutputStream os = new FileOutputStream("lib/data1.txt");
        int i =0 ;
       // Random r = new Random();
        char temp;
        while (i<100){
            temp = 'a'+i >120 ? (char)('a'+i-50) : (char)('a'+i) ;
            os.write(temp);
            i++;
        }

        os.close();

        InputStream is = new FileInputStream("lib/data1.txt");
        byte[] bytes = is.readAllBytes();
        System.out.println(new String(bytes));
    }

}
