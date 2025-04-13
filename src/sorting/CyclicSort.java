package sorting;

import java.util.Arrays;

public class CyclicSort {
    static void cyclicSort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }

    public static void main(String[] args) {
//        int[] arr={8,4,5,6,2,3,1,7};
        int[] arr= {4,3,2,7,8,2,3,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
