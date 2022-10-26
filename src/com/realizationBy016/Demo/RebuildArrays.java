package com.realizationBy016.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RebuildArrays {
    public static void main(String[] args) {
        int[][] data = {{1,2},{3,4}};
        //System.out.println(Arrays.toString(new RebuildArraysSolution().matrixReshape(data, 1, 4))
    //(new RebuildArraysSolution().matrixReshape(data, 2, 4)));
        printArrays(          new RebuildArraysSolution().matrixReshape(data, 1, 4)           );
        printArrays(          new RebuildArraysSolution().matrixReshape(data, 2, 4)           );
//
//        int originLen = mat.length;
//        System.out.println(originLen);
    }
    public static void printArrays ( int[][] data ) {
//        System.out.print("[");
//        for (int i = 0; i < data.length; i++) {
//            System.out.print("[");
//            for (int j = 0; j < data[0].length; j++) {
//                System.out.print(data[i][j] + j<data[0].length-1 ? "," : "" );
//            }
//            System.out.print(  i <data.length-1 ? "]," : "]"   );
//        }
//        System.out.println("]");
//


        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j]);
            }
        }

    }
}
class RebuildArraysSolution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
//        int originLen = mat.length;
//        int originWide = mat[0].length;
//        if ( r == originLen && c/r == originWide ){
//            return mat;
//        }
//        List<Integer> list = new ArrayList<>();
//        int[][] newArrays = new int[r][c/r];
//        for (int[] ints : mat) {
//            for (int j = 0; j < originWide; j++) {
//                list.add(ints[j]);
//            }
//        }
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c/r; j++) {
//                 newArrays[i][j] =  list. get(   i*c/r+j);
//            }
//
//        }
//        return newArrays;





//        int originLen = mat.length;
//        int originWide = mat[0].length;
//        if ( r == originLen && c/r == originWide ){
//            return mat;
//        }
//        int index = 0;
//        int[] tempArrays = new int[c];
//        int[][] newArrays = new int[r][c/r];
//        for (int i = 0 ; i< originLen ; i++) {
//            for (int j = 0; j < originWide; j++) {
//                tempArrays[index++] = mat[i][j];
//            }
//        }
//        index = 0;
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c/r; j++) {
//                 newArrays[i][j] = tempArrays[index] ;
//
//            }
//
//        }
//        return newArrays;


        int R = mat.length;
        int C = mat[0].length;
        if (R * C != r * c) {
            return mat;
        }
        int[][] mat2 = new int[r][c];
        for (int i = 0; i < R * C; i++) {
            mat2[i / c][i % c] = mat[i / C][i % C];
        }
        return mat2;
    }


}