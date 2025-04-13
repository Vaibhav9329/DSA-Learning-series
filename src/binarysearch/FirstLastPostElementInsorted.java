package binarysearch;

import java.util.Arrays;

public class FirstLastPostElementInsorted {
    public static void main(String[] args) {
        int[] nums={3,6,7,7,7,7,7,8,8,10};
        int target = 7;
        FirstLastPostElementInsorted sc=new FirstLastPostElementInsorted();
        System.out.println(Arrays.toString(sc.searchRange(nums,target)));
    }
    public int[] searchRange(int[] nums, int target) {
    int[] ans={-1,-1};
    //check for first occurrence if target first
        ans[0] = search(nums,target,true);
        if(ans[0]!=-1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

        //This function index value of target
    int search(int[] nums,int target,boolean findStartIndex){
        int ans =-1;
        int start=0;
        int end=nums.length-1;
                int mid ;
        while (start<=end){
            mid = (start+end)/2;

            if(target<nums[mid]) {
                end = mid - 1;
            }else if(target >nums[mid]) {
                start = mid + 1;
            }else {
                ans =  mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else {
                    start = mid +1;
                }

        }

    }return ans;
    }
}

