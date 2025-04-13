package StackAndQueue;

public class ImplementingQueueUsingArray {
    int size =10;
    int arr[] = new int[size];
    int start  ;
    int end ;
    int curr_size ;

    void push(int n){
         if(curr_size == size){
             System.out.println( );
         }
         if(curr_size ==0){
             start =0;
             end =0;
         }
         else {
             end = (end+1)% size;
             arr[end] =n;
             curr_size+=1;
         }
    }

    int pop(){
        if(curr_size ==0){
            return -1;
        }
        int cd = arr[start];
        if(curr_size == 1){
            start = end =-1;
        }
        else {
            start= (start+1)%size;
            curr_size -=1;
        }
        return cd;
    }

    int top(){
        if(curr_size == 0){
            return -1;
        }
        return arr[start];
    }
    int size(){
        return curr_size;
    }

    public static void main(String[] args) {
        ImplementingQueueUsingArray s = new ImplementingQueueUsingArray();
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
