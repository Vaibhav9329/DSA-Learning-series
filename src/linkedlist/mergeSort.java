package linkedlist;


import linkedlist.node.Atfirst;

public class mergeSort {
    private Node head;
    private Node tail;
    private int size;

    class Node{
        private   int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public Node sortList (Node head){
        if(head == null || head.next== null){
            return head;
        }
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);

        return mergeTwoLists(left , right);
    }

    Node mergeTwoLists(Node list1, Node list2) {
        Node dumHead = new Node(head.data);
        Node tail = dumHead;

        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = (list1 != null)? list1: list2;
        return dumHead.next;
    }

    public Node getMid(Node head) {
       Node midPrev =null;
       while (head != null && head.next != null){
           midPrev = (midPrev == null) ? head :midPrev.next;
           head = head.next.next;
       }
       Node mid = midPrev.next;
       midPrev.next = null;
       return  mid;
    }

    public void atfirst(int data){
        Node node = new Node(data);


        if (head == null) {
            tail = node;
        }
        node.next = head;
        head = node;
        size += 1;
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
        mergeSort mg = new mergeSort();
        mg.atfirst(4);
        mg.atfirst(2);
        mg.atfirst(1);
        mg.atfirst(3);
        mg.display();

        mg.sortList(mg.head);
        mg.display();

    }
}
