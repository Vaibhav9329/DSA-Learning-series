package array;

import java.util.HashMap;
import java.util.Map;

public class NumGoodPair {

    //---------   brute force approch   [O(n2)]   ---------------

//    public static int numIdenticalPairs(int[] nums) {
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    //-----------   optimal approch   -----------------------
   public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>(); // Create a HashMap to store counts
        int goodPairs = 0; // Initialize the count of good pairs to 0

        // Traverse the array
        for (int num : nums) {
            // Check if the current number is already in the map
            if (countMap.containsKey(num)) {
                goodPairs += countMap.get(num); // Add the number of pairs formed with previous occurrences
            }

            // Update the count of the current number in the map
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return goodPairs; // Return the total number of good pairs
    }



    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
