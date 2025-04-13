package binarysearch;

public class FloorOfNumber {
    static int floornum(int[] arr, int target){

        int start = 0, mid;
        int end = arr.length-1;
        while(start <= end){
            mid = start +(end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int tar = 1;
        System.out.println(floornum(arr,tar));
    }
}
