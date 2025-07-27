package StackAndQueue.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeCL {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(100);
        deque.add(99);
        deque.add(20);
        deque.add(30);
        deque.addFirst(10);

        System.out.println(deque);

        System.out.println(deque.removeLast());
    }
}
