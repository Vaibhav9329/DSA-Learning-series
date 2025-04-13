package array;

public class kadanesAlogMaxSubArray {
    public static int MaxSubArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length; j++){
                int sum =0;
                for (int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max = Math.max(max,sum);
            }
        }
        return max;
    }

    public static int MaxSubarrayKadanesAlgo(int[] arr){
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(sum>max){
                max= sum;
            }
            if(sum <0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
//
        System.out.println(MaxSubArray(arr));
        System.out.println(MaxSubarrayKadanesAlgo(arr));
    }
}
