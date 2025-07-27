package array;

import java.util.Arrays;

public class MoveZeros {

    public static int[] moveZero(int[] arr){
        int j=0;
   for(int i =0 ;i<arr.length;i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,0,2,0,13,12,2,3,0};
//        moveZero(arr);
        System.out.println(Arrays.toString(moveZero(arr)));
    }

}
