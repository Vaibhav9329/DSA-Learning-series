package recursion.arrayProblem;

public class CheckArrIsSorted {
    static boolean sorted(int[] arr, int ind ){
        if (ind ==  - 1) {
            return true;
        }
        return arr[ind]<arr[ind+1]&& sorted(arr,ind+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,7,3,4,5,6};
        if(sorted(arr,0)){
            System.out.println("true is sorted");
        }
        else{
            System.out.println("Not true is unsorted");
        }
    }
}
