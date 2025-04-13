package recursion.patternandSortingExample;

public class TriangleInRecursion {
    static void leftTriangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){

            leftTriangle(r,c+1);
            System.out.print(" * ");
        }else {

            leftTriangle(r-1,0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        leftTriangle(4,0);

    }
}
