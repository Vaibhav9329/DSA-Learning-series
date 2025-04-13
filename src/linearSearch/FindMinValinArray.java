package linearSearch;

public class FindMinValinArray {
    static int minValueArray(int[] arr ){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={23,12,32,-11,1,-45,54,-85,-746};
        System.out.println(minValueArray(arr));
    }
}
