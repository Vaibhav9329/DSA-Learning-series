package array;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i;j<n;j++){
                if(nums[j]==nums[i]){
                    cnt++;
                }
            }
            if(cnt>n/2){
                return nums[i];

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={3,2,2,2,2,3};
        System.out.println(majorityElement(arr));
    }
}
