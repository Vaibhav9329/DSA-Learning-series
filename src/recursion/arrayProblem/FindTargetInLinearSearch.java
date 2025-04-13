package recursion.arrayProblem;

public class FindTargetInLinearSearch {

    public static int searchTragetLinear(int[] arr, int i,int tar){
        if(arr[i]==arr.length){
            return -1;
        }
        if(tar == arr[i]){
            return i;
        }else {
        return    searchTragetLinear(arr,i+1,tar);
    }
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,14,19,18};
        System.out.println(searchTragetLinear(arr,0,18));
    }
}
