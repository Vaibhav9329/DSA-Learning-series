package linearSearch;

import java.util.Arrays;

public class Search2DArray {

    static int[] search2d(int[][] arr,int tar){
        for(int row=0;row<arr.length;row++){
            for(int col = 0; col <arr[row].length;col++){
                if(arr[row][col] == tar){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr ={
                {21,32,434,54,},
                {22,33,433,45},
                {14,23}
        };
        int tar =23;

        int[] ans = search2d(arr,tar);
        System.out.println(Arrays.toString(ans));

    }
}
