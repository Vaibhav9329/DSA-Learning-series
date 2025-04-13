package pattern_EX;
//      *           [3,1,3]
//    * * *         [2,3,2]
//  * * * * *       [1,5,1]
//* * * * * * *     [0,7,0]

public class StarTriangle {
    public static void main(String[] args) {
        triangle(4);
    }

    static void triangle(int n){
    for(int i=0;i<=n;i++){
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        //star
        for(int j=0;j<2+i+1;j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }

    }
    }
}
