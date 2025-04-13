package array;

import java.util.Arrays;

public class RotateImageIn90 {
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    // Main logic  --> Brute force
//        static int[][] rotate(int[][] matrix){
//        int n = matrix.length;
//        int[][] ans= new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                ans[j][n-i-1] = matrix[i][j];
//            }
//        }
//        return ans;
//    }

    //Optimal solution
    static void rotate(int[][] arr){
        for(int i=0; i < arr.length; i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j]  = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length/2; j++){
                int temp=arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;
            }
        }
    }
}
