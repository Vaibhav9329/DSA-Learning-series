package pattern_EX;

public class StarPatternRigUpDown {
    public static void main(String[] args) {
        rightUpDown(5);
    }
    static void rightUpDown(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
