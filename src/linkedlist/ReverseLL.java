package linkedlist;

public class ReverseLL {
    Node head ;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public  void atLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void reverse(int head){
        if(head < 2 ){
            return;
        }
    }
    // Print list
    public void printList(){
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

    }
}
