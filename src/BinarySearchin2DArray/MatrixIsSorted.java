package BinarySearchin2DArray;

import java.util.Arrays;

public class MatrixIsSorted {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,59}
        };
        int target = 35;
        System.out.println(Arrays.toString(findTargInMatrix(arr, target)));
    }
    static int[] findTargInMatrix(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while (row<matrix.length && col>=0 ){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
