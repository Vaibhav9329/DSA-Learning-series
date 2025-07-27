package array;

public class CheckArrayisSortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(check(arr));
    }

    public static boolean check(int[] nums) {
        for(int i=1; i<nums.length; i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
