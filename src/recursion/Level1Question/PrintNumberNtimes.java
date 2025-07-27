package recursion.Level1Question;

import java.util.Scanner;

public class PrintNumberNtimes {
    static void FunToPrint(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(n);
        FunToPrint(i-1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to print {n} for how many times so enter number at {i} ");
        int n= sc.nextInt();
        int i = sc.nextInt();
        FunToPrint(i,n);
    }
}
