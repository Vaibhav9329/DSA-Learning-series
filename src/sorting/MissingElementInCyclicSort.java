package sorting;

public class MissingElementInCyclicSort {
    static int missingElement(int arr[]){
        int i=0;
        while(i<arr.length){
            int correctPost = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correctPost]){
                swap(arr,i,correctPost);
            }else {
                i++;
            }
        }

        // For searching missing element
        for(int id=0;id<arr.length;id++){
            if(arr[id] != id){
                return id;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
//        int[] arr={3,0,1};
        int[] arr={9,5,4,2,3,0,1};
        System.out.println(missingElement(arr));
    }
}
