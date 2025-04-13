package array;

import java.util.Arrays;

public class RunSumOf1DArray {
        public static int[] runningSum(int[] nums) {
            int no = 1;
            int end = nums.length;

            int[] result = new int[end];
            result[0] = nums[0];
            while(no < end){
                result[no] = result[no-1] + nums[no];
                no++;
            }
            return result;
        }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
