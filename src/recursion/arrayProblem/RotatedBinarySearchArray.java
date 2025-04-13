package recursion.arrayProblem;

public class RotatedBinarySearchArray {
    public static void main(String[] args) {
        int[]  arr= {5,6,7,8,9,1,2,3};
        int target = 3;
        System.out.println(findTargetInd(arr,target,0,arr.length-1));
    }

    static int findTargetInd(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

    int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return findTargetInd(arr,target,start,mid-1);
            }else{
                return findTargetInd(arr,target,mid+1,end);
            }
        }
        if(arr[end] >= arr[mid]){
            if(target <= arr[start] && target >= arr[mid]){
                return findTargetInd(arr,target,mid+1,end);
            }
        }
        return findTargetInd(arr,target,start,mid-1);

    }
}
