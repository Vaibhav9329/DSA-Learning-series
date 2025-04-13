package recursion.patternandSortingExample;

import java.util.Arrays;

public class SelectionSortWithRecursion {
    public static void main(String[] args) {
        int[] arr={4,1,3,2,5};
        SelectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int[] arr,int end,int id,int max){
        if(end ==0){
            return;
        }
        if(id < end){
            if(arr[id]>arr[max]){
                SelectionSort(arr,end,id+1,id);
            }else{
                SelectionSort(arr,end,id+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[end-1];
            arr[end-1] = temp;
            SelectionSort(arr,end-1,0,0);

        }
    }
}
