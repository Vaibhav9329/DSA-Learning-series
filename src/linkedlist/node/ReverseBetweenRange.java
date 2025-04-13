package linkedlist.node;

import java.util.Stack;

public class ReverseBetweenRange {
    private  Node head;
    private Node tail;
    int size;
    class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public  ReverseBetweenRange(){
        this.size =0;
    }

    public void attFirst(int data){
        Node node = new Node(data);


        if (tail == null) {
            tail = head;
        }
        node.next = head;
        head = node;
        size += 1;
    }

    public void reverseall(){
        if(size < 2){
            return;
        }
        Node prev = null;
        Node pnode = head;
        Node nexnode = pnode.next;

        while(pnode != null){
            pnode.next = prev;
            prev = pnode;
            pnode = nexnode;
            if(nexnode != null){
                nexnode = nexnode.next;
            }
        }
        head = prev;
    }



    // reverseBetween range
    public Node reverseBetween(Node head, int left, int right) {
            if(left == right){
                return head;
            }

            Node current = head;
            Node prev = null;
            for(int i=0; current != null && i<left-1;i++){
                prev = current;
                current = current.next;
            }
            Node last=prev;
            Node newnode = current;

        //reverse between;
            Node nexnode = current.next;

        for(int i=0; current != null && i<right-left+1;i++){
            current.next = prev;
            prev = current;
            current = nexnode;
            if(nexnode != null){
                nexnode = nexnode.next;
            }
        }
        if(last != null){
            last.next = prev;
        }else {
            head = prev;
        }
        newnode.next = current;
        return head;
    }

        //check once code is not working
//    public Node reverseKGroup(Node head, int k) {
//
//        if(k<= 1 || head ==null){
//
//            return head;
//        }
//
//        Node current = head;
//        Node prev = null;
//
//        while (true){
//            Node last=prev;
//            Node newnode = current;
//
//            //reverse between;
//            Node nextND = current.next;
//
//            for(int i=0; current != null && i<k;i++){
//                current.next = prev;
//                prev = current;
//                current = nextND;
//                if(nextND != null){
//                    nextND = nextND.next;
//                }
//            }
//            if(last != null){
//                last.next = prev;
//            }else {
//                head = prev;
//            }
//            newnode.next = current;
//            if(current == null){
//                break;
//            }
//        }
//        return head;
//    }

    public boolean isPalindrome(Node head) {
        Node temp = head;
        Stack<Node> st = new Stack<>();
        while (temp != null){
            st.push(temp);
            temp= temp.next;
        }

        temp = head;
        while (temp!= null){
            if(temp != st.peek()){
                return false;


            }
            temp= temp.next;
            st.pop();
        }
        return true;
    }



    //happy number
    public boolean isHappy(int no) {
        int slow =no;
        int fast =no;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (slow!= fast);
        if(slow == 1){
            return  true;
        }else {
            return false;
        }
    }

    private int findSquare( int number) {
        int ans = 0;
        while (number >0){
            int rem = number%10;
            ans +=rem*rem;
            number /= 10;
        }
        return ans;
    }



    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        ReverseBetweenRange list = new ReverseBetweenRange();
        list.attFirst(1);

        list.attFirst(2);
//        list.attFirst(3);
//        list.attFirst(3);
        list.attFirst(2);
        list.attFirst(1);
        list.display();
        list.reverseall();
        list.display();
//        list.reverseBetween(list.head, 2,6);
//        list.reverseKGroup(list.head, 3);
//        System.out.println(list.reverseBetween(list.head, 2,5));
        list.display();
        boolean item = list.isPalindrome(list.head);
        System.out.println(item);
        System.out.println(list.isHappy(12));
    }
}
