package com.my016.static_field;

public class ArrayUtils {
    private ArrayUtils(){

    }

    public static String toString (int[] arr) {
        if (arr != null) {
            String result = "[";
            for (int i = 0; i < arr.length; i++) {
                result += (i == arr.length - 1 ? arr[i] : arr[i] + ",");
            }
            result += "]";
            return result;
        }
        else {
            return null;
        }
    }
}
