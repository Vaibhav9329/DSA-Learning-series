package array;

public class ElementAppearsOnce136leet {
    public static void main(String[] args) {
        int arr[] ={2,2,1,1,2,3,1,1};
        System.out.println(singleNumber(arr));
        System.out.println(singleEleHashArray(arr));

    }
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int elem = nums[i];
            int cnt = 0;

            for(int j=0; j<n; j++){
                if(nums[j] == elem){
                    cnt++;
                }
            }
            if(cnt == 1){
                return elem;
            }
        }
        return -1;
    }

    static int singleEleHashArray(int[] arr){
        int max=Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n;i++){
             max = Math.max(max,arr[i]);
        }
        int[] hash = new int[max+1];
        for(int i=0; i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(hash[arr[i]] == 1){
                return arr[i];
            }
        }
        return -1;
    }

}
