package pattern_EX;

public class PatternNumRight {
    public static void main(String[] args) {
        rightNum(5);
        rightNumSeries(5);
    }
    static void rightNum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void rightNumSeries(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

