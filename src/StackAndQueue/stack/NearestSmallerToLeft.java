package StackAndQueue.stack;

import java.util.Stack;

public class NearestSmallerToLeft {
    public static int[] nearSmallerToLeft(int[] arr){
        int n = arr.length;
        int[] nSmalToLeft = new int[n];
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<n;i++) {
            while (!stk.isEmpty() && stk.peek() >= arr[i]) {
                stk.pop();
            }

            nSmalToLeft[i] = stk.isEmpty() ? -1 : stk.pop();

            stk.push(arr[i]);
        }
        return nSmalToLeft;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 2, 5};
        int[] ans = nearSmallerToLeft(arr);

        for(int ele : ans){
            System.out.print(ele + " --> ");
        }
    }
}
