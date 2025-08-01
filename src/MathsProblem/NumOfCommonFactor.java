package MathsProblem;

public class NumOfCommonFactor {
    public static int commonFactors(int a, int b){
        int cnt =0 ;
        int minStore = Math.min(a, b);
        for(int i=1;i<=minStore;i++){
             if(a%i == 0 && b%i == 0){
                 cnt++;
             }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(commonFactors(25,30));
        System.out.println(commonFactors(12,6));
    }
}
