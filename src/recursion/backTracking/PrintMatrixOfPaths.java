package recursion.backTracking;

import java.util.Arrays;

public class PrintMatrixOfPaths {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int[][] path = new int [maze.length][maze[0].length];
        matrixOfAllPath("",maze,0,0,path,1);
//       matrixOfPath("",maze,0,0);
    }
    public static void matrixOfPath(String p,boolean[][] maze,int r,int c  ){
        if(r == maze.length-1 && c==maze[0].length-1  ){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        maze[r][c] = false;

        if(r< maze.length-1){
            matrixOfPath(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            matrixOfPath(p+'R',maze,r,c+1);
        }
        if(r>0){
            matrixOfPath(p+'U',maze,r-1,c);
        }
        if(c>0){
            matrixOfPath(p+'L',maze,r,c-1);
        }
     maze[r][c] = true;
    }


    public static void matrixOfAllPath(String p,boolean[][] maze,int r,int c, int[][] path,int step ){
        if(r == maze.length-1 && c==maze[0].length-1  ){
            path[r][c] = step;
            for(int[] arr:path){

                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;


        if(r< maze.length-1){
            matrixOfAllPath(p+'D',maze,r+1,c, path,step+1);
        }
        if(c<maze[0].length-1){
            matrixOfAllPath(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            matrixOfAllPath(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0){
            matrixOfAllPath(p+'L',maze,r,c-1,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
