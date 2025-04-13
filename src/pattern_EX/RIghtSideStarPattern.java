package pattern_EX;

public class RIghtSideStarPattern  {
    public static void main(String[] args) {
        rightStarPattern(5);
    }
    static  void rightStarPattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
