package recursion.Level1Question;

public class PrintNTo1_numbers {
    public static void main(String[] args) {
        printNos(10);
    }
    static public void printNos(int N)
    {
        if(N<=0){
            return;
        }
        System.out.print(N+" ");
        printNos(N-1);
    }
}
