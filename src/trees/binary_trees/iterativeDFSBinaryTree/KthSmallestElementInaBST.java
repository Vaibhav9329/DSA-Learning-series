package trees.binary_trees.iterativeDFSBinaryTree;

public class KthSmallestElementInaBST {

    public static int kthSmallest(Node root, int k) {
        return helper(root,k).val;
    }

    static int count=0;

    public static Node helper(Node root, int k) {
        if(root == null){
            return null;
        }

        Node left =  helper(root.left,k);

        if(left != null){
            return left;
        }

        count++;

        if(count == k){
            return root;
        }

        return helper(root.right,k);
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.left.left.left = new Node(0);
        root.left.right.right = new Node(0);
        root.left.left.left.left = new Node(1);



        int kthsmall = kthSmallest(root,3);

        System.out.println("kth smallest elements: "+ kthsmall);
    }


}
