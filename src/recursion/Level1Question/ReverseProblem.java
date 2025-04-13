package recursion.Level1Question;

public class ReverseProblem {

    static int reverse(int n, int sum){

        if(n==0){
            return sum ;
        }
        int rem = n%10;
        sum = sum*10+rem;
        return reverse(n/10, sum);
        
    }

    static boolean palin(int n,int sum){
        int reversed = reverse(n,sum);
        return  n==reversed;
    }
    // Another Method
//    static int rev2Method(int n){
//        int digits = (int)(Math.log10(n))+1;
//        return helper(n,digits);
//    }
//    private static int helper(int n, int digits){
//        if(n%10==n){
//            return n;
//        }
//        int rem =n%10;
//        return rem * (int)Math.pow(10,digits-1)+helper(n/10,digits-1);
//    }
    public static void main(String[] args) {
//        System.out.println(reverse(1234,0));
//        System.out.println(rev2Method(1234567));
        int n=121;
        if(palin(n,0)){
            System.out.println(n+" "+"is palindrome");
        }else{
            System.out.println(n+" "+"is not palindrome");
        }

    }

}
