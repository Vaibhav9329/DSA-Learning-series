package linkedlist.node;




public class Atfirst {

    private    Node head;
    private Node tail;
    private int size;

    class Node{
      private   int data;
      private   Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public Atfirst(){
        this.size =0;
    }

    public void atFirst(int data){
        Node node = new Node(data);


        if (head == null) {
            tail = node;
        }
        node.next = head;
        head = node;
        size += 1;
    }

        // ---------- reverse list --------------
//    public void reverseall(){
//        if(size < 2){
//            return;
//        }
//        Node prev = null;
//        Node pnode = head;
//        Node nexnode = pnode.next;
//
//        while(pnode != null){
//            pnode.next = prev;
//            prev = pnode;
//            pnode = nexnode;
//            if(nexnode != null){
//                nexnode = nexnode.next;
//            }
//        }
//        head = prev;
//    }

        //--------- Remove Duplicate from sorted list ---------------
//    public void removeDuplicates(){
//        Node c_node = head;
//        while (c_node.next != null){
//            if( c_node.data == c_node.next.data){
//            c_node.next = c_node.next.next;
//            size--;
//            }else {
//                c_node = c_node.next;
//            }
//        }
//        tail = c_node;
//        tail.next = null;
//    }

    public void atLast(int val) {
        Node newNode = new Node(val);
            if(head == null){
               atFirst(val);
               return;
            }

           tail.next = newNode;
           tail = newNode;
           size++;
    }


    public Node middleNode(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node temp = head;
        int count= 0;
        while(temp != null){
            count +=1;
            temp=temp.next;
        }

        int mid = (count/2)+1;
        temp = head;

        while(temp != null){
            mid = mid -1;

            if(mid==0){
                break;
            }
            temp = temp.next;
        }
        return temp;
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
        Atfirst atf = new Atfirst();
        atf.atFirst(1);
        atf.atFirst(2);
        atf.atFirst(3);
        atf.atFirst(2);
        atf.atFirst(3);
//        atf.atFirst(3);
//        atf.atFirst(3);
//        atf.atFirst(4);

        atf.display();
//       atf.reverseall();
//       atf.display();
//        atf.removeDuplicates();
//        atf.display();


//        System.out.println(atf.middleNode(atf.head));
//        atf.display();


//        atf.atLast(1);
//        atf.atLast(1);
        atf.atLast(2);
        atf.atLast(3);
        atf.atLast(3);
        atf.atLast(3);
        atf.display();
    }

}
