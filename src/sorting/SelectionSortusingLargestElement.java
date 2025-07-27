package sorting;

import java.util.Arrays;

public class SelectionSortusingLargestElement {
    public static void main(String[] args) {
        int[] arr = {50,40,20,10,30};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

//    static void selection(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            //find the item in the remaining array and swap with correct index
//            int  last = arr.length-i-1;
//            int maxItem = getMaxitem(arr,0,last);
//            swap(arr,maxItem,last);
//        }
//    }
//    static int getMaxitem(int[] arr, int start, int end){
//        int max = start;
//        for(int i=0;i<= end;i++){
//            if(arr[max]<arr[i]){
//                max=i;
//            }
//        }
//        return max;
//    }
//    static void  swap(int[] arr, int start,int last){
//        int temp = arr[start];
//        arr[start]=arr[last];
//        arr[last]=temp;
//    }

    static void selection(int[] arr){
        for(int i=0;i< arr.length;i++){

            int lastEle = arr.length-i-1;
            int maxitem = getMax(arr,0,lastEle);
            swap(arr,maxitem,lastEle);
        }
    }
    static int getMax(int[] arr, int a, int z)
    {
        int max = a;
        for(int i=0;i< z; i++){
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int a, int z){
        int temp = arr[a];
        arr[a] = arr[z];
        arr[z] = temp;
    }
}
