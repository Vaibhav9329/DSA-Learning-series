package linkedlist.node;

public class SwapPairRecursive {
    private Node head;
     private Node tail;


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

    public static Node swapPairsRecursive(Node head) {
        // Base case: If list is empty or has only one node, no swap is needed
        if (head == null || head.next == null) {
            return head;
        }

        // Nodes to be swapped
        Node firstNode = head;
        Node secondNode = head.next;

        // Swapping process - secondNode becomes the new head
        firstNode.next = swapPairsRecursive(secondNode.next);
        secondNode.next = firstNode;

        // Return the new head of the swapped pair
        return secondNode;
    }


}
