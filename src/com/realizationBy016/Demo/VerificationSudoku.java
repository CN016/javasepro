package com.realizationBy016.Demo;

//import java.util.Arrays;

import java.util.HashSet;
import java.util.Set;

public class VerificationSudoku {
    public static void main(String[] args) {
    String[][] strings1 ={ {"5","3",".",".","7",".",".",".","."}
                          ,{"6",".",".","1","9","5",".",".","."}
                          ,{".","9","8",".",".",".",".","6","."}
                          ,{"8",".",".",".","6",".",".",".","3"}
                          ,{"4",".",".","8",".","3",".",".","1"}
                          ,{"7",".",".",".","2",".",".",".","6"}
                          ,{".","6",".",".",".",".","2","8","."}
                          ,{".",".",".","4","1","9",".",".","5"}
                          ,{".",".",".",".","8",".",".","7","9"} } ;

    String[][] strings2 ={ {"8","3",".",".","7",".",".",".","."}
                          ,{"6",".",".","1","9","5",".",".","."}
                          ,{".","9","8",".",".",".",".","6","."}
                          ,{"8",".",".",".","6",".",".",".","3"}
                          ,{"4",".",".","8",".","3",".",".","1"}
                          ,{"7",".",".",".","2",".",".",".","6"}
                          ,{".","6",".",".",".",".","2","8","."}
                          ,{".",".",".","4","1","9",".",".","5"}
                          ,{".",".",".",".","8",".",".","7","9"}};
    char[][] chars1 = new char[strings1.length][strings1[0].length];
    char[][] chars2 = new char[strings2.length][strings2[0].length];
        for (int i = 0; i < strings1.length; i++) {
            for (int j = 0; j < strings1[i].length; j++) {
                chars1[i][j] = strings1[i][j].charAt(0);
            }
        }
        for (int i = 0; i < strings2.length; i++) {
            for (int j = 0; j < strings2[i].length; j++) {
                chars2[i][j] = strings2[i][j].charAt(0);
            }
        }

//        for (int i = 0; i < chars1.length; i++) {
//            for (char c : chars1[i]) {
//                System.out.println(c);
//            }
//        }

        System.out.println(new VerificationSudokuSolution().isValidSudoku(chars1));
        System.out.println(new VerificationSudokuSolution().isValidSudoku(chars2));
    }
}
class VerificationSudokuSolution {
    public boolean isValidSudoku(char[][] board) {
        ///////////////////验证各行//////////////////////
        for (char[] chars : board) {
            Set<Character> set = new HashSet<>();
            for (char aChar : chars) {
                if ( aChar != '.'){
                    if ( set.contains(aChar) ){
                        return false;
                    }else {
                        set.add(aChar);
                    }
                }
            }
        }
        ///////////////////验证各行//////////////////////
 //////////////////////////////////////////////////////////////
        ///////////////////验证各列////////////////////


        for (int j = 0; j < board.length; j++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < board[j].length; i++) {
                if ( board[i][j] !='.' ){
                    if ( set.contains(board[i][j]) ){
                        return false;
                    }else {
                        set.add(board[i][j]);
                    }
                }
            }
        }

        ///////////////////验证各列////////////////////
////////////////////////////////////////////////////////////////
        ///////////////////验证9X9////////////////////

        for (int i = 0; i < board.length; i+=3) {
            for (int j = 0; j < board[i].length; j+=3) {
                Set<Character> set = new HashSet<>();
                for (int index = i; index < i+3; index++) {
                    for (int just = j; just < j+3; just++) {
                        if ( board[index][just] !='.' ){
                            if ( set.contains(board[index][just]) ){
                                return false;
                            }else {
                                set.add(board[index][just]);
                            }
                        }
                    }
                }
            }
        }
        ///////////////////验证9X9////////////////////
        return true;

    }
}