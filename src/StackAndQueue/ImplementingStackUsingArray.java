package StackAndQueue;

public class ImplementingStackUsingArray {
    int ele =-1;
    int size = 10;
    int[] arr = new int[size];

     void push(int x){
         ele +=1;
         arr[ele] = x;
    }
    int top(){
         if(ele == -1){
            return -1;
         }
        return arr[ele];
    }
    int pop(){
         if(ele == -1){
             return -1;
         }
         ele = ele -1;
         return arr[ele];
    }
    int size(){
         return ele + 1;
    }

    public static void main(String[] args) {
        ImplementingStackUsingArray s = new ImplementingStackUsingArray();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(8);
        s.push(7);
        s.push(1);
        s.push(0);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Top of the stack after deleting an element " + s.top());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Top of the stack after deleting an element " + s.top());
        System.out.println("Size of the stack after deleting an element " + s.size());

    }

}
