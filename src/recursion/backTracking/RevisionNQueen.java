package recursion.backTracking;

public class RevisionNQueen {
    public static void main(String[] args) {
        int n=8;
        boolean[][] board= new boolean[n][n];
        System.out.println(queen(board,0));
    }

    static int queen(boolean[][] board ,int  r){
        if(r == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count=0;
        //we are now placing the queen
        for(int col =0;col<board.length;col++){
            //place the queen if it is safe
            if(isSafe(board,r,col)){
                board[r][col] = true;
                count += queen(board,r + 1);
                board[r][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
    //Check vertical col
        for(int i=0;i<r;i++){
            if(board[i][c]){
                return false;
            }
        }

        //check diagonal left
        int maxleft = Math.min(r,c);
        for(int i=1;i<=maxleft;i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        //check diagonal right
        int maxRight = Math.min(r,board.length-c-1);
        for(int i=1;i<=maxRight;i++){
            if(board[r-1][c+1]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
