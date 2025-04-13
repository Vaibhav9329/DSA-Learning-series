package recursion.Level1Question;

public class Print1ToN_number {

    static public void printNos(int N,int i)
    {
        if(i>N){
            return;
        }
        System.out.print(i+" ");
        printNos(N,i+1);
    }

    public static void main(String[] args) {
        printNos(10,1);
    }
}
