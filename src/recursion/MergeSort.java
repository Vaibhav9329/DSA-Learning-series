package recursion;

import java.util.Arrays;

public class MergeSort {
   static int[] mergeSort(int[] arr){
       if(arr.length==1){
           return arr;
       }
       int mid= arr.length/2;

       int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
       int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

       return merge(left,right);
   }

    static int[] merge(int[] left, int[] right){
       int[] mix = new int[left.length+right.length];

       int i=0;
       int j=0;
       int k=0;

       while(i < left.length && j < right.length){
           if(left[i] < right[j]){
               mix[k] = left[i];
               i++;
           }else {
               mix[k] = right[j];
               j++;
           }
           k++;
       }
       // it may be one of the array not complete;
       //copy the remaining elements;
       while (i< left.length){
           mix[k]=left[i];
           i++;
           k++;
       }
       while (j<right.length){
           mix[k]=right[j];
           j++;
           k++;
       }
       return mix;
   }
    public static void main(String[] args) {
    int[] arr={1,5,2,6,4,2,1};
    arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
