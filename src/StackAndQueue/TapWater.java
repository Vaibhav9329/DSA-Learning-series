package StackAndQueue;

public class TapWater {
//        Trapping rain water between '0' and lower numbers
//    Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//    Output: 6

        public static int tapwater(int[] hegt){
            int n = hegt.length;
            int[] prefix = new int[n];
            int[] sufix  = new int [n];

            prefix[0] = hegt[0];
            for(int i=1;i<n;i++){
                prefix[i] = Math.max(prefix[i-1], hegt[i]);
            }

            sufix[n-1] = hegt[n-1];
            for(int i=n-2;i>=0;i--){
                sufix[i] = Math.max(sufix[i+1], hegt[i]);
            }

            int tapwater = 0;
            for(int i=0;i<n;i++){
                tapwater += Math.min(prefix[i],sufix[i]) - hegt[i];
            }
            return tapwater;
        }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr1 = {4,2,0,3,2,5};

        System.out.println(tapwater(arr));
        System.out.println(tapwater(arr1));
    }
}
