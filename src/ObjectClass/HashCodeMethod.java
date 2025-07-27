package ObjectClass;

import java.util.Scanner;

public class HashCodeMethod {
    public static void main(String[] args) {
      int n;
        System.out.println("enter size to array");
        Scanner ac = new Scanner(System.in);
        n= ac.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements to array");

        for(int i=0;i<n;i++){
            arr[i] = ac.nextInt();
        }
        int[] hash = new int[13];
        for (int i=0;i<n; i++){
            hash[arr[i]] += 1;
        }

        System.out.println(hash);
    }
}
