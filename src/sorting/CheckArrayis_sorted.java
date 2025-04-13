package sorting;

public class CheckArrayis_sorted {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5 ,6};
       if(checkArrSorted(arr)){
           System.out.println("Array is sorted");
       }
       else{
           System.out.println("Array is unsorted");
       }

    }
    static boolean checkArrSorted(int[] arr){
        int i=1;
        while(i<arr.length){

            if(arr[i-1]>arr[i]){
                return false;
            }else {
                i++;
            }
        }
        return true;
    }
}
