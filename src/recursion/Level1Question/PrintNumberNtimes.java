package recursion.Level1Question;

import java.util.Scanner;

public class PrintNumberNtimes {
    static void FunToPrint(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        FunToPrint(i-1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to print {n}");
        int n= sc.nextInt();
        FunToPrint(5,n);
    }
}
