package binarysearch;

public class CeilingOfNumber {

    static int ceilingNumber(int[] arr,int target){
        if(target >arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while(start <= end ){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
             if(arr[mid]<target){

                 start = mid + 1;
            }else{
                 end = mid - 1;

            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int tar = 6;
        System.out.println(ceilingNumber(arr,tar));
    }
}
