package sorting;

import java.util.Arrays;

public class SelectionSortusingLargestElement {
    public static void main(String[] args) {
        int[] arr = {50,40,20,10,30};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the item in the remaining array and swap with correct index
            int  last = arr.length-i-1;
            int maxItem = getMaxitem(arr,0,last);
            swap(arr,maxItem,last);
        }
    }
    static int getMaxitem(int[] arr, int start, int end){
        int max = start;
        for(int i=0;i<= end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void  swap(int[] arr, int start,int last){
        int temp = arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}
