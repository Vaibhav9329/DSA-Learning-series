package recursion.Level1Question;

public class SumOf_Digits   {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(122));
    }
    static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
          n/=10;
        return rem+sumOfDigit(n);
    }
}
