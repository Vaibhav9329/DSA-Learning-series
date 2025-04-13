package recursion.backTracking;

import java.util.ArrayList;

public class MazeProblem {
    static int count (int r, int c){
        if(r==3 || c==3){
            return 1;
        }
        int left = count(r+1,c);
        int right = count(r,c+1);

        return left+right;
    }

    static void path(String p ,int r, int c){
        if(r==1 && c==1){
            System.out.println(p );
            return;
        }
        if(r>4){
            path(p+'D',r+1,c);
        }
        if(c>4){
            path(p+'R', r,c+1);
        }
    }

    static ArrayList<String> pathRet(String p , int r, int c){
        if(r==1 && c==1){
         ArrayList<String > list = new ArrayList<>();
         list.add(p);
            return list;
        }

        ArrayList<String> listPath = new ArrayList<>() ;
        if(r>1){
           listPath.addAll( pathRet(p+'D',r-1,c));
        }
        if(c>1){
           listPath.addAll( pathRet(p+'R', r,c-1));
        }

        return listPath;
    }

    static ArrayList<String> pathRetDaigonal(String p , int r, int c){
        if(r==1 && c==1){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> listPath = new ArrayList<>() ;
        if(r>1 && c>1){
            listPath.addAll(pathRetDaigonal(p+'D',r-1,c-1));
        }
        if(r>1){
            listPath.addAll( pathRetDaigonal(p+'L',r-1,c));
        }

        if(c>1){
            listPath.addAll( pathRetDaigonal(p+'R', r,c-1));
        }


        return listPath;
    }


    static void pathRestrication(String p ,boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p );
            return;
        }
        if(maze[r][c]==false  ){
            return;
        }
        if(r<maze.length-1){
            pathRestrication(p+'D', maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestrication(p+'R', maze, r,c+1);
        }
    }

    static ArrayList<String> pathWithObstacle(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> listpath = new ArrayList<>();
        if(!maze[r][c]){
            listpath.add(p);
            return listpath;
        }

//        if(r<maze.length-1 && c<maze[0].length-1){
//            listpath.addAll(pathWithObstacle(p+'l',maze,r+1,c+1));
//        }
        if(r<maze.length-1){
            listpath.addAll(pathWithObstacle(p+'d',maze,r+1,c));
        }
        if(c<maze[0].length-1){
            listpath.addAll(pathWithObstacle(p+'r',maze,r,c+1));
        }

        return listpath;
    }
    public static void main(String[] args) {
//        System.out.println(count(1,1 ));
//        path("",3,3);
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathRetDaigonal("",3,3));
        boolean [][] board = {
                {true , true, true},
                {true, false, true},
                {true, true, true}
        };
//        pathRestrication("",board,0,0);
        pathWithObstacle("",board,0,0);
        System.out.println(pathWithObstacle("",board,0,0));
   }
}
