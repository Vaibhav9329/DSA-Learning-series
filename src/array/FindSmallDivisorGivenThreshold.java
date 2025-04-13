package array;

public class FindSmallDivisorGivenThreshold {
    public static void main(String[] args) {
        int[] nums={1,2,5,9};
        int n =  6;
//        System.out.println(smallestDivisor(nums,n));
        System.out.println(smallestDiv(nums , n));
    }

    //TC :- N + max
//    public static  int smallestDivisor(int[] nums, int threshold) {
//        int maxi = Integer.MAX_VALUE;
//        for(int i=0; i<nums.length; i++){
//            maxi = Math.max(nums[i],maxi);
//        }
//
//        for(int d=1; d<= maxi;d++){
//            int sum=0;
//            for(int i=0;i<nums.length;i++){
//                sum += Math.ceil((double)nums[i]/(double) d);
//            }
//
//            if(sum <= threshold){
//                return d;
//            }
//        }
//        return -1;
//    }

    static int smallestDiv(int[] arr, int threshold){
        int n = arr.length-1;
        if(n>threshold){
            return -1;
        }
        int maxi = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            maxi = Math.max(arr[i],maxi);
        }

        int low=1 , high = maxi;
        while(low <= high){
            int mid = low+(high - low)/2;
            if(sumBydiv(arr,mid) <= threshold){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
    static int sumBydiv(int[] arr, int div){
        int n = arr.length;

        int sum =0;
        for(int i=0;i<n;i++){
            sum += Math.ceil((double) arr[i] / (double) div );
        }
        return  sum;
    }
}
