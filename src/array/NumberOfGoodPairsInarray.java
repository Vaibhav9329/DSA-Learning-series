package array;

public class NumberOfGoodPairsInarray {
    static int numGoodpairs(int[] arr){

//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//


        int cunt=0;
        int start = 0;
        int end=arr.length-1;
        while(start < end){
            int j= start+1;
                while(j<end){
                    if(arr[start] == arr[j]){
                        cunt++;
                    }
                    j++;
                }
                start++;
        }
        return cunt;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,2};
        System.out.println(numGoodpairs(arr));
    }
}
