package array;

import java.util.Arrays;

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
//Example 1:
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//Example 2:
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//Example 3:
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]
public class git Sumof1DArray {

    public int[] runningSum(int[] nums){
        int start=1;
        int end = nums.length;

        int[] result=new int[end];
        result[0]=nums[0];

        while(start < end){
            result[start] = result[start-1]+nums[start];
            start++;
        }
        return result;
    }
    public static void main(String[] args) {
        Sumof1DArray sum = new Sumof1DArray();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 1, 1, 1, 1};
        int[] nums3 = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(sum.runningSum(nums1)));
        System.out.println(Arrays.toString(sum.runningSum(nums2)));
        System.out.println(Arrays.toString(sum.runningSum(nums3)));

    }
}
