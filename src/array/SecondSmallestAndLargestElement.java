package array;

public class SecondSmallestAndLargestElement {
    public static void secondSmallestLargestElement(int[] arr,int n){
        if(n == 0 || n == 1){
            System.out.println(-1);
        }
        int small = arr[0];
        int s_small = arr[1];
        int largest = arr[0];
        int s_largest = arr[1];

        for(int i=0;i<n;i++){
            if(arr[i] < small){
                s_small = small;
                small = arr[i];
            }
            if(arr[i]>largest){
                s_largest = largest;
                largest = arr[i];
            }

            if(arr[i]<s_small && arr[i] != small ){
                s_small =arr[i];
            }
            if(arr[i]>s_largest && arr[i]!= largest){
                s_largest = arr[i];
            }
        }
        System.out.println(s_largest );
        System.out.println(s_small);

    }

    public static void main(String[] args) {
        int[] arr  = {2,3,4,52,22,1,44,54,65,66};
        int n=arr.length;
        secondSmallestLargestElement(arr,n);
    }
}
