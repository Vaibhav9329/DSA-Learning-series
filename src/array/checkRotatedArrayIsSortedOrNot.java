package array;

public class checkRotatedArrayIsSortedOrNot {
    public static boolean check(int[] arr){
        int cnt=0, n = arr.length-1;

        for(int i=0;i<n;i++){
            if(arr[i] > arr[(i+1)%n]){
                cnt++;
            }
            if(cnt>1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        System.out.println(check(arr));
    }
}
