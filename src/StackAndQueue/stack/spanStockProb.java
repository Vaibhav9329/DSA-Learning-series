package StackAndQueue.stack;

import java.util.Stack;

public class spanStockProb {
        Stack<int[]> stk ;

        public spanStockProb(){
            stk = new Stack<>();
        }

    public int next(int price) {
        int span =1;
        while(!stk.isEmpty() && stk.peek()[0] <= price){
            span += stk.pop()[1];
        }

        stk.push(new int[]{price,span});

        return span;
    }

    public static void main(String[] args) {
        spanStockProb obj = new spanStockProb();
        System.out.println(obj.next(100)); // 1
        System.out.println(obj.next(80));  // 1
        System.out.println(obj.next(60));  // 1
        System.out.println(obj.next(70));  // 2
        System.out.println(obj.next(60));  // 1
        System.out.println(obj.next(75));  // 4
        System.out.println(obj.next(85));  // 6

    }
}
