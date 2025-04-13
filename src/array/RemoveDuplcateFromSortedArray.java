package array;

import java.util.HashSet;

public class RemoveDuplcateFromSortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,4,4,5,5,6,6};
        int k =removeDuplicates(nums);
        int z=removeDUPelement(nums);
            System.out.println(nums[k]);
        System.out.println(nums[z]);
    }
    //Brute force approach TC :- N logN
    public static int removeDuplicates(int[] arr) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }

    //Optimal approch:- TC :- O(n) SC :- O(n)
    public static int removeDUPelement(int[] nums){
        int n= nums.length;
        int i=0;
        for(int j=1; j<n; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return (i+1);
    }
}
