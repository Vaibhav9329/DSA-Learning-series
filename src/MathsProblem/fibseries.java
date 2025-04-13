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
        n -=2;
        int temp=0;
        System.out.print(n1+" "+n2+" ");
        while(n>2){
          temp = n1+n2;// 0+1=1
            System.out.print(temp+" ");
            n1=n2;
            n2=temp;
            n--;
        }

    }
}
