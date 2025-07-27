package recursion.Level1Question;

public class BasicProg {
    public static void main(String[] args) {
//        FunRev(1);
        Fun(0);
    }

    // Concept of n-- vs  --n
    static void Fun(int n){
        if(n==10){
            return;
        }
        System.out.println(n);
        Fun(n+=1);
    }

//    static void FunRev(int n){
//        if(n==11){
//            return;
//        }
//
//        System.out.println(n);
//        FunRev(n=n+1);
//    }

//    static void FunBoth(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        FunBoth(--n);
//       System.out.println(n);
//
//    }
}
