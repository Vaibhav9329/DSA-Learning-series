package array;

import java.util.Scanner;

public class ReverseOfArray {
    static void reverse(int[] arr){
        int i;
        for(i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of array");
        int[] arr=new int[5];
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }
}
