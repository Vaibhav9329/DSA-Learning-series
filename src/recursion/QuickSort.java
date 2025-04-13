package recursion;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int arr[],int start,int end){
    if(start >= end){
        return;
    }
    int s=start;
    int e = end;
    int mid=start+(end-start)/2;
    int pivot = arr[mid];
    while (start<=end){
        while (arr[start]<pivot){
            start++;
        }
        while (arr[end]>pivot){
            end--;
        }
        if(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    quickSort(arr,start,e);
    quickSort(arr,s,end);
    }
    public static void main(String[] args) {
        int[]arr={5,3,4,2,1};
        int start = 0;
        int end = arr.length-1;
         quickSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
}
