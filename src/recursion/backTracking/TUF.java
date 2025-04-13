package recursion.backTracking;
import java.util.*;
class TUF {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        boolean[][] board = new boolean[n][n];  // Initialize the chessboard
        solveBoard(board, 0, result);   // Start placing queens from row 0
        return result;
    }

    private static void solveBoard(boolean[][] board , int row, List<List<String>> rslt){
        if(row == board.length){
            rslt.add(display(board));
            return;
        }

        for(int col =0 ; col < board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] =true;
                solveBoard(board,row+1,rslt);
                board[row][col]=false;
            }
        }
    }
    private static boolean isSafe(boolean[][] board,int row, int col){
        for(int i=0; i<row; i++){
            if(board[i][col] ){
                return false;
            }
        }

        int maxleft = Math.min(row , col);
        for(int i=1;i<= maxleft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int maxRight = Math.min(row,board.length-col-1);
        {
            for(int i=1;i<=maxRight;i++){
                if(board[row-i][col+i]){
                    return false;
                }
            }
        }
        return true;
    }

    private static List<String> display(boolean[][] board){
        List<String >  finalBoard = new ArrayList<>();
        for(boolean[] row : board){
            String rwString =" ";
            for(boolean cell: row){
                if(cell){
                    rwString = "Q";
                }
                else{
                    rwString =".";
                }
            }
            finalBoard.addAll(Collections.singleton(rwString));
        }
        return finalBoard;
    }

    public static void main(String[] args) {
        int n = 4;

//        System.out.println(solveNQueens(n));
          // You can change this value to test with different sizes of the board
        List<List<String>> result = solveNQueens(n);

        // Print all solutions
        System.out.println(  n );
        int i = 1;
        for (List<String> board : result) {
            System.out.print( i );
            for (String row : board) {
                System.out.print(row);
            }
            System.out.println();
            i++;

        }
    }
}