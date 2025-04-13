package recursion;

public class BinarySearchUingRecursion  {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target = 7;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search (int[] arr, int tar, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[mid] > tar){
            return search(arr,tar,start,mid-1);
        }
        return search(arr,tar,mid+1,end);
    }

}
