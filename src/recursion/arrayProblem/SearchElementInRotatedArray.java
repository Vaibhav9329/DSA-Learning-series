package recursion.arrayProblem;

public class SearchElementInRotatedArray {
        public static int searchElement(int[] arr, int tar,int start,int end ){
            if(start > end){
                return -1;
            }
            int mid = start+(end-start)/2;
            if(arr[mid] == tar){
                return mid ;
            }
            if(arr[start]<=arr[mid]){
                if(tar>=arr[start] && tar<=arr[mid]){
                    return searchElement(arr,tar,start,mid-1);
                }
                else {
                    return searchElement(arr,tar,mid+1,end);
                }
            }

            if(arr[end]>= arr[mid]){
                return searchElement(arr,tar,mid+1,end);
            }
             return searchElement(arr,tar,start,mid-1);
        }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        int tar = 5;
        System.out.println(searchElement(arr,tar,0,arr.length-1));
    }
}
