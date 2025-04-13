package BinarySearchin2DArray;

import java.util.Arrays;

public class FIndTargetIn2DSortedArray {
    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c > 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            } else if (target < matrix[r][c]) {
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1, -1};
    }

     public static void main(String[] args) {
        int[][] arr={
                {20,30,40,50},
                {31,41,51,61},
                {42,52,62,72}
        };
        int target = 51;
        System.out.println(Arrays.toString(search(arr,target)));
    }
}

