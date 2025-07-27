package slidingWindow;

public class SubarrayOfKsize {
    public static int subArray(int[] arr, int k){
        int i=0,j=0;
        int sum=0, max =Integer.MIN_VALUE;
        int n=arr.length;
        while(j< n){
            sum = sum+arr[j];
            if(j-i+1 < k){
                j++;
            } else if (j-i+1 == k) {
                max = Math.max(max, sum);
                sum = sum -arr[i];
                i++;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;
        System.out.println(subArray(arr,k));
    }
}
