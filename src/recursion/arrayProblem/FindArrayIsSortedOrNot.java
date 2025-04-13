package recursion.arrayProblem;

public class FindArrayIsSortedOrNot {
     static boolean SortedOrNot(int[] arr, int i){
        if(i==arr.length-1){
            return  true;
        }
        return arr[i] < arr[i+1] && SortedOrNot(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(SortedOrNot(arr,0));
//        if(SortedOrNot(arr,0)){
//            System.out.println("is sorted");
//        }else {
//            System.out.println("is not sorted");
//        }
    }
}
