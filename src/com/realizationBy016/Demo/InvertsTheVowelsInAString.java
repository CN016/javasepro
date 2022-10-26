package com.realizationBy016.Demo;

public class InvertsTheVowelsInAString {
    public static void main(String[] args) {
        System.out.println(new InvertsTheVowelsInAStringSolution().reverseVowels("hello"));
        System.out.println(new InvertsTheVowelsInAStringSolution().reverseVowels("leetcode"));
    }
}
class InvertsTheVowelsInAStringSolution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while (start<=end){
            if ( vowel(chars[start]) &&  vowel(chars[end]) ){
                //Swap
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end]   = temp;
                start++;
                end--;
                continue;
            }

         if ( vowel(chars[start]) ){
             start--;
         }
         if (  vowel(chars[end])  ){
             end++;
         }


         start++;
         end--;
        }
        StringBuilder sBuilder = new StringBuilder();
        for (char aChar : chars) {
            sBuilder.append(aChar);
        }
        s = sBuilder.toString();
        return s;
    }
    private boolean vowel(char vow)
    {
        return vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u' || vow == 'A' || vow == 'E' || vow == 'I' || vow == 'O' || vow == 'U';
    }
}
