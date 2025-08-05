package StackAndQueue.stack;

import java.util.Stack;

public class NearestSmallerAtRight {
    public static int[] nerSmallerAtRight(int[] arr){
        int n = arr.length;
        int[] nerStoLeft = new int[n];
        Stack<Integer> stk = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while (!stk.isEmpty() && stk.peek() >= arr[i]){
                stk.pop();
            }

//            if(i<n){
//                if(stk.isEmpty()){
//                    nerStoLeft[i] = -1;
//                }else{
//                    nerStoLeft[i] = stk.peek();
//                }
//            }


            nerStoLeft[i] = stk.isEmpty()? -1:stk.peek();

            stk.push(arr[i]);
        }
        return nerStoLeft;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        int[] res = nerSmallerAtRight(arr);
        for(int ele : res){
            System.out.print(ele+"  ");
        }
    }
}
