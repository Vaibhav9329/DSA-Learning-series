package array;

import java.util.Arrays;

public class PlusOneInArrayinLast {
        public static int[] plusOne(int[] arr) {
        int n=arr.length;
        int i=n-1;
        while(i>=0){
            arr[i]++;
            if(arr[i]<0){
                return arr;
            }
            arr[i] = 0;
            i--;
        }
        int[] newArr = new int[n+1];
        newArr[0]=1;
        return newArr;

        }
    public static void main(String[] args) {
        int[] arr={9,9};
        System.out.println(Arrays.toString(plusOne(arr))) ;
    }
}
