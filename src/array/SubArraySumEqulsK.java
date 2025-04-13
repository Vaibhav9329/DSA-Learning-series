package array;

public class SubArraySumEqulsK {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(sbArraySmEQLk(arr,3));
    }
    //BETTER apprach { o(n2) -> time complexity }
    public  static int sbArraySmEQLk(int[] arr, int k){
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int sm =0;
            for(int j=i;j<n;j++){
                sm +=arr[j];
                if(sm == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
