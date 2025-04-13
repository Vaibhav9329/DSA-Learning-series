package recursion.backTracking;

import java.util.Scanner;

public class NQueenProblem {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];  // 4x4 chessboard
        System.out.println(queens(board, 0));   // Start placing queens from row 0
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {   // If all queens are placed
            display(board);            // Show the solution
            System.out.println();        // Count this solution
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {      // Try placing a queen in each column
            // place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true;         // Check if it's safe
                count += queens(board, row + 1);        // Move to the next row
                board[row][col] = false;        // Remove the queen (backtrack)
            }
        }

        return count;       // Return total solutions found
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical row (same column)
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;       // Queen already placed in this column
            }
        }


        // Check diagonal left (\)
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;       // Queen already placed diagonally
            }
        }

        // Check diagonal right (/)
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;       // Queen already placed diagonally
            }
        }

        return true;    // If safe, return true

    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("Q ");     // Print Queen
                } else {
                    System.out.print("X ");     // Print Empty Space
                }
            }
            System.out.println();
        }
    }
}
