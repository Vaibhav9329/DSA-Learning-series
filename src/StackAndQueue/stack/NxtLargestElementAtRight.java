package StackAndQueue.stack;

import java.util.Stack;

public class NxtLargestElementAtRight {
//    public static int[] nxTLargestAtRght(int[] arr){
//        int n=arr.length;
//        int[] res = new int[n];
//        Stack<Integer> nXtEle = new Stack<>();
//
//       for(int i = n-1;i>=0;i--){
//            while (nXtEle.isEmpty() == false && arr[nXtEle.peek()] <= arr[i]){
//                nXtEle.pop();
//            }
//
//            res[i] = nXtEle.isEmpty()? -1 : arr[nXtEle.peek()];
//
//            nXtEle.push(i);
//       }
//
//       return res;
//    }

    public static int[] nxTLargestAtRght(int[] nums){
        int n = nums.length;
        int nge[] = new int[n];
        Stack < Integer > st = new Stack < > ();
        for (int i =    n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i]) {
                st.pop();
            }

//            if (i < n) {
//                if (st.isEmpty() == false) nge[i] = st.peek();
//                else nge[i] = -1;
//            }

            nge[i] = !st.isEmpty()? st.peek() : -1;

            st.push(nums[i]);
        }
        return nge;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,5};
        int[] val = nxTLargestAtRght(nums);
        for(int ele : val){
            System.out.println(ele+" ");
        }
    }
}
