package com.my016.Automatic_text_recognition;

import java.util.ArrayList;

public class TextProcess {

    private ArrayList<String> arrayList = new ArrayList<>();

    public TextProcess(String str) {

        int index = 0,k=1;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            if( k==0 && ch[i]==' '&& ch[i+1]!=' '){
                k=1;
                index=i+1;
                continue;
            }
            if (  ch[i]=='：'|| ch[i]==':'  ){
                index=i+1;
            }
            if ( k==1 && ch[i]==' ' || i== ch.length-1 ){
                if (i==ch.length-1){
                    i++;
                }
                arrayList.add(  str.substring(index,i)  );
                k=0;
            }

        }
        System.out.println(arrayList);


    }



}
