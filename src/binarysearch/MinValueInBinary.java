package binarysearch;

    // Two Pointer approch

public class MinValueInBinary {
    static int minValue(int[] arr){
        int start=0;
        int end = arr.length-1;
        int min = arr[start];
        while (start <= end){
            if(arr[start]<min){
                min=arr[start];
            }
            start++;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,-6,7,1,-1};
        System.out.println(minValue(arr));
    }
}
