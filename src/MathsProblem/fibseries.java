package MathsProblem;

import java.util.Scanner;

public class fibseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ot find fib series ");
        int n=sc.nextInt();

        fibseriesMethod(n);
    }
        //0,1,1,2,3
    static void fibseriesMethod(int n){
        int n1=0;
        int n2=1;
        for(int i = 0; i<n;i++){
            System.out.print(n1+" ");

            int n3 = n2+n1;
            n1=n2;
            n2=n3;
        }

    }
}
