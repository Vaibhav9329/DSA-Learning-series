package BinarySearchin2DArray;

public class Search2DMatrixTarget {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 33;
        System.out.println(searchMatrix(matrix,target));
    }
    public  static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m= matrix[0].length;

        int strt = 0 ;
        int end = n*m-1;
        while(strt <= end){
            int mid = strt + (end - strt)/2;
            int r = mid /m;
            int c = mid % m;
            if(matrix[r][c] == target){
                return true;
            }else if(matrix[r][c] < target){
                strt = mid+1;
            }else {
                end = mid-1;
            }
        }

        return false;
    }
}
