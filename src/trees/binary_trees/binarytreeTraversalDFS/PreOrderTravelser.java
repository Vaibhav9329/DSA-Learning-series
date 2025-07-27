package trees.binary_trees.binarytreeTraversalDFS;

import trees.binary_trees.Tree_Node;

import java.util.ArrayList;
import java.util.List;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }

    Node(int val, Tree_Node left, Tree_Node right){
        this.val = val;
        this.left = null;
        this.right = null;
    }


}

public class PreOrderTravelser {
    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting preorder traversal
        List<Integer> result = preOrder(root);

        // Displaying the preorder traversal result
        System.out.print("Preorder Traversal: ");
        // Output each value in the
        // preorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


    public static List<Integer> preOrder(Node root){
        List<Integer> arr = new ArrayList<>();

        preorder(root , arr);

        return arr;
    }

    public static void preorder(Node root, List<Integer> arr){
        if(root == null){
            return;
        }
        arr.add(root.val);

        preorder(root.left,arr);
        preorder(root.right,arr);

    }
}
