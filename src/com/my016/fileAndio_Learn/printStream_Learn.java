package com.my016.fileAndio_Learn;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class printStream_Learn {
    public static void main(String[] args) throws Exception{
        PrintStream ps = new PrintStream(new FileOutputStream("lib/printStream_Learn_Result.txt"));

        ps.println(114);
        ps.println(14);
        ps.println(114);
        ps.println(4);

    }
}
