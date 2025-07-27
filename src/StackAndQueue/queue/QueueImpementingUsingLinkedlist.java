package StackAndQueue.queue;

import java.util.NoSuchElementException;

public class QueueImpementingUsingLinkedlist<T> {
    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T item){
        QueueNode<T> t = new QueueNode<>(item);

        if(last != null){
            last.next = t;
        }
        last = t;
        if(first == null){
            first = last;
        }
    }

    public T remove(){
        if(first == null) throw new NoSuchElementException();
        T data = first.data;
        first =  first.next;
        if(first == null){
            last = null;
        }
        return data;
    }

    public T peek(){
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public static void main(String[] args) {
        QueueImpementingUsingLinkedlist<Integer> queue = new QueueImpementingUsingLinkedlist<>();

        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);

        // Peeking the front of the queue
        System.out.println("Peek: " + queue.peek());

        // Removing elements from the queue
        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.remove());

        // Check the next element
        System.out.println("Peek after removals: " + queue.peek());

        // Check if queue is empty
        System.out.println("Is empty? " + queue.isEmpty());

        // Remove remaining element
        System.out.println("Removed: " + queue.remove());
        System.out.println("Peek: " + queue.peek());
        // Check if queue is empty now
        System.out.println("Is empty? " + queue.isEmpty());
    }

}
