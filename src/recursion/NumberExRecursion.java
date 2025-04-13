package recursion;

public class NumberExRecursion {
    public static void main(String[] args) {
        print(1);
    }
        // without base condition IN it we cannot stop recursive call
        // function call keep happening stack will be filled again and again
        // memory of computer will exceds the limit -> it known as stackover flow error.
//    static void print(int n){
//        System.out.println(n);
//        print(n+1);
//    }

    //using base conditin we can stop recursive call
    static void print(int n){
        if(n==100) {
            System.out.println(100 );
            return;
        }
        System.out.println(n);

        //recursive call
        // if you are calling a function again and again,
        // you can treat it as a separate call in the stack

        //this is called tail recursion
        // this is last function call
        print(n+1);
    }
}
