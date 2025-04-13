package binarysearch;

//Return the minimum integer k such that she can eat all the bananas within h hours.

public class KoKoEatingBananas {
    public static void main(String[] args) {
        int[] piles={3,4,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles,h));
    }
        //Brute force :- TC O( max(arr)+n)

//    public static int minEatingSpeed(int[] arr, int h) {
//        int maxi = findmax(arr);
//        for (int i=1;i<=maxi;i++){
//            int reqtime = calTimetotalHour(arr,i);
//            if(reqtime <= h){
//                return i;
//            }
//        }
//        return maxi;
//    }


    public static int minEatingSpeed(int[] arr, int h) {
        int low = 1;
        int high = findmax(arr);

        while (low <= high){
            int mid = low+(high-low)/2;
            int totalTime  = calTimetotalHour(arr,mid);
            if(totalTime < h){
                high = mid-1;
            }else {
                low = mid +1;
            }
        }
        return low;
    }

    static int calTimetotalHour(int[] arr, int hrs){
        int totalh = 0;
        int n = arr.length;
        for(int i= 0;i<n;i++){
            totalh += Math.ceil((double) arr[i] / (double) hrs  );
        }
        return totalh;
    }

    static int findmax(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}
