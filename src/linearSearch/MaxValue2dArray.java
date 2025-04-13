package linearSearch;

public class MaxValue2dArray {
    static int maxval(int[][] arr){
        int max = arr[0][0];
        for(int[] no : arr ){
            for(int num : no){
                if(num>max){
                    max =  num;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1223,32,43,432,22},
                {22,44,55,45,6574},
                {21,42,65,78,68}
        };

        System.out.println(maxval(arr));
    }
}
