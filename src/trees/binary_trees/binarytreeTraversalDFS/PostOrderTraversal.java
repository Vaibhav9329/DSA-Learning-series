package trees.binary_trees.binarytreeTraversalDFS;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal
{
    public static void main(String[] args) {

        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting preorder traversal
        List<Integer> result = postOrder(root);

        // Displaying the preorder traversal result
        System.out.print("Postorder Traversal: ");
        // Output each value in the
        // preorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static List<Integer> postOrder(Node root){
        List<Integer> arr = new ArrayList<>();

        postorder(root, arr);
        return arr;
    }

    public static void postorder(Node root, List<Integer> arr){
        if(root == null){
            return;
        }

        postorder(root.left,arr);
        postorder(root.right,arr);
        arr.add(root.val);
    }
}
