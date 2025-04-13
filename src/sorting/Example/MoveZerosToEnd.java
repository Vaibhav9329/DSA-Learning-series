package sorting.Example;

import java.util.Arrays;

public class MoveZerosToEnd {
     static void moveZero(int[] arr){
        int j=0;
        int i =0 ;
        while (i<arr.length){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
