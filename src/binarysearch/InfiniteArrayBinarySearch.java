package binarysearch;

public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170,190,200,230,260,290,310,330};
        int target = 110;
        System.out.println(findingRange(arr, target));
        }
        static int findingRange(int[] arr, int targrt){
        // first find the range
            // first start with a box of size 2
            int start =0;
            int end =1;

            //condition for the target ta lie in the range
            while (targrt > arr[end]){
                int newStart = end+1;
                 // double the box value
                // end = previous end+sizeofbox*2;
                end = end+(end-start+1) *2;
                start = newStart;
            }
            return infiniteBinarySearch(arr,targrt,start,end);
        }

    static int infiniteBinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end= mid-1;
            } else if (target >arr[mid]) {
                start = mid+1;
            }else {
                return arr[mid];
            }
        }
        return arr[start];
    }

}
