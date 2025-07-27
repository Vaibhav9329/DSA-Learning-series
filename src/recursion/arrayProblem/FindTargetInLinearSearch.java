package recursion.arrayProblem;

public class FindTargetInLinearSearch {

    public static int searchTragetLinear(int[] arr, int i,int tar){
     if(arr.length == -1){
         return -1;
     }
     if(arr[i] == tar){
         return i;
     }
     return searchTragetLinear(arr,i+1, tar);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,14,19,21,23,18};
        System.out.println(searchTragetLinear(arr,0,18));
    }
}
