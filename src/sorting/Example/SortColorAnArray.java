package sorting.Example;

import java.util.ArrayList;
import java.util.Arrays;

public class SortColorAnArray {
    // brute froce approch
   static int[] sortArray(int[] arr){
       Arrays.sort(arr);
       return arr;
   }


    //  bette approch
    static int[] sortArrayBetter(int[] arr){
        int n = arr.length;
        int cnt0=0,cnt1=0,cnt2=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                cnt0++;
            } else if (arr[i] == 1) {
                cnt1++;
            }else {
                cnt2++;
            }
        }
        int ind=0;
        for(int i=0;i<cnt0;i++){
            arr[ind++]=0;
        }
        for(int i=0;i<cnt1;i++){
            arr[ind++]=1;
        }
        for(int i=0;i<cnt2;i++){
            arr[ind++]=2;
        }
        return arr;

    }

    // optimal sol Dutch national flag algorithm
    static void sortArraysDutchAlgo(int[] arr){
        int l =0 , m=0 , h=arr.length-1;
        while (m <= h){
            if(arr[m] ==0){
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;

                l++;
                m++;
            }
            else if (arr[m] == 1){
                m++;
            }
            else {
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;

                h--;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {2,0,1};
        sortArraysDutchAlgo(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortArray(arr)));
        System.out.println(Arrays.toString(sortArrayBetter(arr)));
    }
}
