package pattern_EX;

public class StarPtternDown {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}
