package sorting;

public class FindDuplicateNumberusingCyclicSort {
    static int  findOneDuplicate(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] != i+1){
                int correctPost = arr[i] -1;
                if(arr[i] != arr[correctPost]){
                    swap(arr,i,correctPost);
                }else{
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findOneDuplicate(arr));
    }
}
