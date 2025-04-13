package linearSearch;

public class SearchInRange {
    static int linearSearch(int[] arr,int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i=start; i<end; i++){
            int  element =arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr={11,21,3,43,4,34,54,32};
        int target = 43;

        System.out.println(linearSearch(arr,target,2,6));
    }
}
