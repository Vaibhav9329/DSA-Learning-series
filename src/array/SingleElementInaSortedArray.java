package array;

public class SingleElementInaSortedArray {
    public static void main(String[] args) {
       int[] nums = {1,1,2,2,3,3,4,5,5,6,6,7,7,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

    //brute force approch
//    public static  int singleNonDuplicate(int[] nums) {
//    int  n = nums.length;
//    if(n == 1){
//        return nums[0];
//    }
//    for(int i=0; i<n; i++){
//        if(i==0){
//            if(nums[i] != nums[i+1]){
//                return nums[i];
//            }
//        }else if(i == n-1){
//            if(nums[i]!= nums[i-1]){
//                return nums[i];
//            }
//        }else {
//            if(nums[i]!= nums[i+1] && nums[i]!=nums[i-1]){
//                return nums[i];
//            }
//        }
//    }
//    return -1;
//    }
//

    // optimal approch
    public static  int singleNonDuplicate(int[] nums){
        int n=nums.length;
        if(n == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[n-1] !=nums[n-2]){
            return nums[n-1];
        }

        int s = 1;
        int ed = n-2;
        while(s <= ed){
            int mid = s +(ed-s)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            if((mid%2 == 1 && nums[mid] == nums[mid-1]) || (mid%2 == 0 && nums[mid] == nums[mid+1])){
                s = mid+1;
            }else{
                ed =mid-1;
            }
        }
        return -1;
    }

}
