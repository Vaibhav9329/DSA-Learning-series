package binarysearch;

import java.util.Arrays;

public class BinarySearch {
    public static int binary(int[] arr,int tar){
      int low=0,high=arr.length-1,mid ;
      while (low<=high){
          mid = low+(high-low)/2;
          if(arr[mid] == tar) {
              return mid;
          }
          if(tar<arr[mid]) {
              high = mid - 1;
          }else {
              low = mid + 1;
          }
      }
      return -1;
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90};
        System.out.println(binary(arr,70));
//        System.out.println(binary(arr,50));
//        System.out.println(binary(arr,70));
//        System.out.println(binary(arr,90));
//        System.out.println(binary(arr,100));
    }
}
