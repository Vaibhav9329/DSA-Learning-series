package recursion;

public class FibonacciNum5 {
     public static void main(String[] args) {

         int ans = fab(10);
         System.out.println(ans);

    }
    static int fab(int n){
        if(n<2){
            return n;
        }
         return fab(n-1)+fab(n-2);
    }

}
