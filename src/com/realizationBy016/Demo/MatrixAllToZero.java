package com.realizationBy016.Demo;

import java.util.ArrayList;
import java.util.List;

public class MatrixAllToZero {
    public static void main(String[] args) {
    int[][] data1 = {{1,1,1},{1,0,1},{1,1,1}};
    int[][] data2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};


    new MatrixAllToZeroSolution().setZeroes(data1);
    new MatrixAllToZeroSolution().setZeroes(data2);

    new MatrixAllToZeroSolution().printTwoDimensionalArrays(data1);
    new MatrixAllToZeroSolution().printTwoDimensionalArrays(data2);
    }
}
class MatrixAllToZeroSolution {
    public void setZeroes(int[][] matrix) {
        //遍历找零
        //记录0的位置
        List<MatrixAllToZeroSolution> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ( matrix[i][j] == 0 ){
                    list.add(new MatrixAllToZeroSolution(i,j));
                }
            }
        }
        //开始转换
        for (MatrixAllToZeroSolution matrixAllToZeroSolution : list) {
            zeroesProcess(matrix, matrixAllToZeroSolution.getRow(), matrixAllToZeroSolution.getColumn());
        }
    }
    private int row;
    private int column;

    public MatrixAllToZeroSolution(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public MatrixAllToZeroSolution() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    //private List<MatrixAllToZeroSolution> list = new ArrayList<>();
    private void zeroesProcess ( int[][] data, int  row , int column ){
        for (int i = 0; i < data.length; i++) {
            data[i][column] = 0;
        }
        for (int j = 0 ;j <data[0].length ;j++ ){
            data[row][j] =0;
        }
    }
    public void printTwoDimensionalArrays (int[][] data){
        System.out.print("{");
        for (int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(     j<data[i].length-1 ?  data[i][j] +"," : data[i][j]     );
            }
            System.out.print("]");
            System.out.print(    i< data.length-1 ? "," : ""   );
        }
        System.out.println("}");
    }
}