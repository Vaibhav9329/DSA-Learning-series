package recursion.stringquestioin.Permutation;

import java.util.ArrayList;
import java.util.List;

public class PermutationNumber {

        private static void recurPermute(int id,int[ ] nums, List<List<Integer>> ans){
            if(id == nums.length){
                List<Integer> ds = new ArrayList<>();
                for (int i=0; i<nums.length;i++){
                    ds.add(nums[i]);
                }
                ans.add(new ArrayList<>(ds));                                                                     
                return;
            }
            for(int i =id; i<nums.length;i++){
                swap(i,id,nums);
                recurPermute(id+1,nums,ans);
                swap(i,id,nums);
            }

        }
        private static void swap(int i,int j, int[] nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
        }
        public static List<List<Integer>> permute (int[] nums){
            List<List<Integer>> ans = new ArrayList<>();
            recurPermute(0,nums,ans);
            return ans;
        }
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        System.out.println(permute(nums));
    }
}
