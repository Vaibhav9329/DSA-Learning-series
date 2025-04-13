package binarysearch;

public class KthMissingPostNumber {
    public static void main(String[] args) {
      int  arr[] = {2,3,4,7,11}, k =5;
        System.out.println(findKthPositive(arr,k));
        System.out.println(findKthPosit(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            if(arr[i] <= k) {
                k++;
            }else {
                break;
            }
        }
        return k;
    }

    public static int findKthPosit(int[] arr, int k) {
        int n = arr.length;
        System.out.println(n);
        int strt = 0;
        int end = n-1;
        while(strt <= end){
            int mid = strt + (end - strt)/2;
            int misElement = arr[mid]-mid;
            if(misElement < k){
                strt = mid+1;
            }else {
                end = mid-1;
            }
        }

        return k+end+1;
    }

}
