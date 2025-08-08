package StackAndQueue.stack;

import java.util.Stack;

public class StockSpanProblem {

    public static int[] stockSpanProb(int[] arr){
        int n = arr.length;
        int[] spb = new int[n];

        Stack<Integer> stk = new Stack<>();

        for(int i = 0;i<n;i++){
            while (!stk.isEmpty() && arr[stk.peek() ] <= arr[i]){
                stk.pop();
            }

            if(stk.isEmpty()){
                spb[i] = i+1;
            }
            else {
                spb[i] = i-stk.peek();
            }

            stk.push(i);
        }

        return spb;
    }

    public static void main(String[] args) {
        int[] price = {100,80,60,70,60,75,85};
        int[] res = stockSpanProb(price);
        for(int ele : res){
            System.out.print(ele+" ");
        }
    }
}
