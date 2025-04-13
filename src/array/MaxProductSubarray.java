package array;

import java.util.Arrays;

public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] nums={0,2};

        System.out.println(maxProduct(nums));
    }
  // brute force approach
//    public static int maxProduct(int[] arr){
//        int max = Integer.MIN_VALUE;
//
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                int prd =1;
//                for(int k=i;k<=j;k++){
//                    prd *=arr[k];
//                }
//                max=Math.max(max,prd);
//            }
//        }
//        return max;
//    }

    //better approach
//    static int maxProduct(int arr[]) {
//        int res = arr[0];
//        for (int i=0;i<arr.length-1;i++){
//            int p=arr[i];
//            for(int j=i+1;j<arr.length;j++){
//                res = Math.max(res,p);
//                p *= arr[j];
//            }
//            res = Math.max(res,p);
//        }
//        return res;
//    }

    //optimal solution
    static int maxProduct(int arr[]){
        int p1=arr[0], p2=arr[0], res=arr[0];
        for(int i=1;i<arr.length;i++){
            int temp = Math.max(arr[i],Math.max(p1*arr[i],p2*arr[i]));
            p2 = Math.min(arr[i],Math.min(p1*arr[i],p2*arr[i]));
            p1 =temp;
            res = Math.max(res,p1);
        }
        return res;
    }



}
