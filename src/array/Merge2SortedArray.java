package array;

import java.util.Arrays;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,5,6};
        int[] nums2 = {2,4,7,8,9};
        merge(nums1, 5,nums2,5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    public static void merge(int[] nums1, int n, int[] nums2, int m) {
        int lft = 0;
        int rght = 0;
        int k=0;
        int[] nums3 = new int[n+m];
        while(lft < n && rght < m ){
            if( nums1[lft] <= nums2[rght] ){
                nums3[k] = nums1[lft];
                lft++;
                k++;
            }
            else{
                nums3[k] = nums2[rght];
                rght++;
                k++;
            }
        }
        while(lft < n ){
            nums3[k++] = nums1[lft++];
        }
        while(rght < m){
            nums3[k++] = nums2[rght++];
        }

        for(int i=0; i<n+m;i++){
            if(i<n){
                nums1[i] = nums3[i];
            }
            else{
                nums2[i-n] = nums3[i];
            }
        }
    }


//    static void merge(int[] arr1, int[] arr2, int n, int m){
//        int left = n-1;
//        int right =0;
//
//        while(left >= 0 && right < m){
//            if(arr1[left] > arr2[right]){
//                int temp = arr1[left];
//                arr1[left]= arr2[right];
//                arr2[right] = temp;
//                left++;
//                right++;
//            }else{
//                break;
//            }
//        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//    }
}
