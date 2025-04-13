package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisapperedElementUsingCyclicSort {
    static List<Integer> finDisapperedElmInArray(int[] nums){
        int i=0;
        while(i<nums.length){
            int  correctpost = nums[i]-1;
            if(nums[i]!=nums[correctpost]){
                swap(nums,i,correctpost);
            }else{
                i++;
            }
        }
        // just find missing number
        List<Integer> ans = new ArrayList<>();
        for(int ind=0; ind<nums.length;ind++){
            if(nums[ind]!=ind+1){
                ans.add(ind+1);
            }
        }return ans;
    }

    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
           //  int[] arr={1,4,1,2,1,2,4};
        System.out.println(finDisapperedElmInArray(arr));
    }
}
