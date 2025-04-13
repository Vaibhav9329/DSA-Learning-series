package MathsProblem;

public class FindPrimeNO {
    public static void main(String[] args) {
        int n=1093;
        for(int i=1;i<=n;i++){
            System.out.println(i+" "+isPrime(i));
        }

       // System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
