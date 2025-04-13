package array;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums={1,2,1,2,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
//    public static int findPeakElement(int[] nums) {
//        int n = nums.length;
//        for(int i=0;i<n;i++){
//            if((i == 0 || nums[i-1]<nums[i]) && (i ==n-1 || nums[i] > nums[i+1])){
//                return i;
//            }
//        }
//        return -1;
//    }

    static int findPeakElement(int[] arr){
        int n = arr.length;
        if(n == 1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[n-1]> arr[n-2]){
            return n-1;
        }

        int start = 1;
        int end = n-2;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(arr[mid-1]< arr[mid] && arr[mid]> arr[mid+1]){
                return mid;
            }
            if(arr[mid]>arr[mid-1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
