package array;

import java.lang.reflect.Array;

//leetcode - 73
public class SetMatrixAsZero {
//    static void setMatrixZeroes(int[][] arr) {
//        int n = arr.length;
//        int m = arr[0].length;
//
//        boolean[] row = new boolean[n];
//        boolean[] col = new boolean[m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] == 0) {
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (row[i] || col[j]) {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//    }

    //  OR

    static void setMatrixZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == -1 || col[j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[][] mat = {
                {0, 1, 2, 0},
                {3, 4, 4, 2},
                {1, 3, 1, 5}
        };

        setMatrixZeroes(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}