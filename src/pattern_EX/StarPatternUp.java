package pattern_EX;

public class StarPatternUp {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
