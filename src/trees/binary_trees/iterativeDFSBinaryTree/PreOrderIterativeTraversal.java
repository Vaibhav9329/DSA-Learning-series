package trees.binary_trees.iterativeDFSBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node{
      int val;
     Node left;
     Node right;


    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class PreOrderIterativeTraversal {

    public static List<Integer> preOrderItreativeTravel(Node root){
        List<Integer> preorder = new ArrayList<>();
        if(root == null){
            return preorder;
        }

        Stack<Node> st = new Stack<>();
            st.push(root);

            while (!st.isEmpty()){
                root = st.pop();

                preorder.add(root.val);
                if(root.left != null){
                    st.push(root.left);
                }

                if(root.right != null){
                    st.push(root.right);
                }
            }
            return preorder;
    }

    public static void main(String[] args) {
        // Creating a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Initializing the Solution class


        // Getting the preorder traversal
        List<Integer> result = preOrderItreativeTravel(root);

        // Displaying the preorder traversal result
        System.out.print("Preorder Traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    }

