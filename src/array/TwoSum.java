package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> toid=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int values=target-nums[i];
            if(toid.containsKey(values)){
                return new int[]{toid.get(values),i};
            }
            toid.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};

        System.out.println( Arrays.toString(twoSum(arr,17)));
    }
}
