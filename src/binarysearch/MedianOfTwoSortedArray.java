package binarysearch;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int num1[] ={1,2};
        int num2[]={3,4};
      //  System.out.println(median(num1,num2));
        System.out.println(findMedianSortedArrays(num1,num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n= nums1.length;
     int m= nums2.length;

     int[] arr = new int[n+m];
     int i=0 , j=0, k=0;
     while(i<n && j<m){
         if(nums1[i] < nums2[j]){
             arr[k] = nums1[i];
             i++;
             k++;
         }else {
             arr[k] = nums2[j];
             j++;
             k++;
         }
     }
     while (i<n){
         arr[k]=nums1[i];
         i++;
         k++;
     }
     while (j<m){
         arr[k] = nums2[j];
         j++;
         k++;
     }
     int sum=n+m;
     if(sum%2 == 1){
         double med = (double) arr[sum/2];
         return med;
     }
     double median = ((double) arr[sum/2]+(double) arr[(sum/2)-1])/2.0;
     return median;
    }


//    public static double median(int[] a, int[] b) {
//        // Size of two given arrays
//        int n1 = a.length;
//        int n2 = b.length;
//
//        int n = n1 + n2; //total size
//        //required indices:
//        int ind2 = n / 2;
//        int ind1 = ind2 - 1;
//        int cnt = 0;
//        int ind1el = -1, ind2el = -1;
//
//        //apply the merge step:
//        int i = 0, j = 0;
//        while (i < n1 && j < n2) {
//            if (a[i] < b[j]) {
//                if (cnt == ind1) ind1el = a[i];
//                if (cnt == ind2) ind2el = a[i];
//                cnt++;
//                i++;
//            } else {
//                if (cnt == ind1) ind1el = b[j];
//                if (cnt == ind2) ind2el = b[j];
//                cnt++;
//                j++;
//            }
//        }
//
//        //copy the left-out elements:
//        while (i < n1) {
//            if (cnt == ind1) ind1el = a[i];
//            if (cnt == ind2) ind2el = a[i];
//            cnt++;
//            i++;
//        }
//        while (j < n2) {
//            if (cnt == ind1) ind1el = b[j];
//            if (cnt == ind2) ind2el = b[j];
//            cnt++;
//            j++;
//        }
//
//        //Find the median:
//        if (n % 2 == 1) {
//            return (double)ind2el;
//        }
//
//        return (double)((double)(ind1el + ind2el)) / 2.0;
//    }
}
