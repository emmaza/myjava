package com.company;

/**
 * Created by emma on 7/7/15.
 */
public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] board={{'.','8','7','6','5','4','3','2','1'},{'1','.','.','.','.','.','.','.','.',},
                {'2','.','.','.','.','.','.','.','.',},{'3','.','.','.','.','.','.','.','.',},
                {'4','.','.','.','.','.','.','.','.',},{'5','.','.','.','.','.','.','.','.',},
                {'6','.','.','.','.','.','.','.','.',},{'7','.','.','.','.','.','.','.','.',},
                {'8','.','.','.','.','.','.','.','.',},{'9','.','.','.','.','.','.','.','.',}};
        if(isValidSudoku(board)) System.out.println("yes");
        else System.out.println("no");

    }

    public static boolean isValidSudoku(char[][] board){
        for(int i=0; i<9; i++) {   // test each row and column
            if(findDup(board,i,0,i,8)) return false;
            if(findDup(board,0,i,8,i)) return false;
        }
        for(int i=0; i<9; i+=3){// test each section
            if(findDup(board,0,i,2,i+2)) return false;
            if(findDup(board,3,i,5,i+2)) return false;
            if(findDup(board,6,i,8,i+2)) return false;
        }
        return true;
    }

    public static boolean findDup(char[][] partBoard, int x1, int y1, int x2, int y2){
        int tmp=0;
        boolean[] bo = new boolean[9]; // default: false
        for(int i=x1; i<=x2; i++){
            for(int j=y1; j<=y2; j++) {
                Character c = partBoard[i][j];
                if (partBoard[i][j] != '.') tmp=partBoard[i][j] - '0';
                else continue;
                if (bo[tmp-1]) return true; // duplicates found
                bo[tmp-1] = true;
            }
        }
        return false; //no duplicates
    }
}

/* another way to test sections:
for (int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if (findDup(board,i*3,j*3,i*3+2,j*3+2)) return false;
        }
    }
 */