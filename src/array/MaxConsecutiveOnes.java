package array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] arr) {
        int cunt = 0, maxCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cunt++;
            } else {
                cunt = 0;
            }
            maxCnt = Math.max(maxCnt, cunt);
        }
        return maxCnt;
    }
}
