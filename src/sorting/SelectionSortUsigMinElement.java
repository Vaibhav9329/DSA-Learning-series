package sorting;

import java.util.Arrays;

public class SelectionSortUsigMinElement {

    public static  void selectionMinElement(int[] arr){
        for(int i =0;i<arr.length;i++){
            int minpost = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpost]>arr[j]){
                    minpost = j;
                }
                }
                int temp = arr[i];
                arr[i]= arr[minpost];
                arr[minpost]= temp;

        }
    }
//public static void print(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//    System.out.println();
//}


    public static void main(String[] args) {
        int[] arr={5,3,4,2,1};
        selectionMinElement(arr);
        System.out.println(Arrays.toString(arr));

    }
}
