package recursion.backTracking;

public class NQueenRevision {
        public static void nQueen(boolean[][] board,int row){
            if(row == board.length){
                display(board);
                System.out.println();
                return ;
            }

            for(int col = 0;col<board.length;col++) {
                if (isSafe(board, row, col)) {
                    board[row][col] = true;
                    nQueen(board, row + 1);
                    board[row][col] = false;
                }
            }
        }

        public static boolean isSafe(boolean[][] board,int r , int c){
//            check vertically col
            for(int i=0;i<r;i++){
                if(board[i][c]){
                    return false;
                }
            }

//            check diagonally left
            for(int i=1;i<=Math.min(r,c);i++){
                if(board[r-i][c-i]){
                    return false;
                }
            }

//              check   diagonally right

            for(int i=1;i<=Math.min(r,board.length-c-1);i++){
                if(board[r-i][c+i]){
                    return false;
                }
            }

            return true;
        }

        public static void display(boolean[][] board){
            for(boolean[] row : board){
                for(boolean element : row){
                    if(element){
                        System.out.print(" Q ");
                    }
                    else {
                        System.out.print(" X ");
                    }
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        nQueen(board,0);
    }
}
