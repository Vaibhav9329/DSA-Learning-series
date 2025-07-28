package binarysearch;

import java.util.Arrays;

public class FirstLastPostElementInsorted {
    public static void main(String[] args) {
        int[] nums={3,6,6,6,6,6,6,6,6,6,8};
        int target = 6;
        FirstLastPostElementInsorted sc=new FirstLastPostElementInsorted();
        System.out.println(Arrays.toString(sc.searchRange(nums,target)));
    }
    public int[] searchRange(int[] nums, int target) {
    int[] ans={-1,-1};
    //check for first occurrence if target first
        ans[0] = search(nums,target,true);
        if(ans[0]!= -1){
            ans[1] = search(nums,target,false);
        }

        return ans;
    }

        //This function index value of target
    public static int search(int[] arr, int tar, boolean fStartIndex){
        int ans =-1;
        int start =0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start +(end - start)/2;
            if(arr[mid] <tar){
                start = mid + 1;
            } else if (arr[mid] > tar) {
                end = mid - 1;
            }else{
                ans = mid;
                if(fStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }


}

