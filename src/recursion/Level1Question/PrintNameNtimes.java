package recursion.Level1Question;

import java.util.Scanner;

public class PrintNameNtimes {
    static void funPrintName( int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Vaibhav");
        funPrintName(i+1,n);
    }

    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  number time to Print {n}");
        n=sc.nextInt();
        funPrintName(1,n);
    }
}
