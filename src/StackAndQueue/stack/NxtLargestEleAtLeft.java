package StackAndQueue.stack;

import java.util.Stack;

public class NxtLargestEleAtLeft {
    static int[] nxtLgstElAtLeft(int[] arr){
        int n =arr.length;
        int[] ngeLeft = new int[n];
        Stack<Integer > stck = new Stack<>();

        for(int i=0;i< n;i++){
            while(!stck.isEmpty() && stck.peek() <= arr[i]){
                stck.pop();
            }

            if(i<n){
                if(stck.isEmpty()){
                    ngeLeft[i] = -1;
                }
                else {
                    ngeLeft[i] = stck.peek();
                }
            }

            stck.push(arr[i]);
        }

        return ngeLeft;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        int[] res = nxtLgstElAtLeft(arr);

        for(int no : res){
            System.out.print(no+" --> ");
        }
    }
}
