package recursion.Level1Question;

import java.util.Scanner;

public class PrintNoByBackTracking {
    static void FunToPrint(int n){
        if(n<1){
            return;
        }
        FunToPrint(n-1);
        System.out.println(n );

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to print {n}");
        int n= sc.nextInt();
        FunToPrint(n);
    }
}
