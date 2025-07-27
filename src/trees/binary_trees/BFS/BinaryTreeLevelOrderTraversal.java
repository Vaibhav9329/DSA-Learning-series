package trees.binary_trees.BFS;

import trees.binary_trees.Tree_Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }

    Node(int val, Tree_Node left, Tree_Node right) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeLevelOrderTraversal {


    public static List<List<Integer>> levelOrder(Node root){
            List<List<Integer>> ans = new ArrayList<>();

            if(root == null){
                return ans;
            }

        Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();

                List<Integer> level = new ArrayList<>();
                for(int i=0;i<size;i++){
                    Node node=q.poll();

                    level.add(node.val);

                    if(node.left != null){
                        q.add(node.left);
                    }
                    if(node.right != null){
                        q.add(node.right);
                    }
                }
                ans.add(level);
            }
        return ans;
    }

    // Function to print
    // the elements of a list
    static void printList(List<Integer> list) {
        // Iterate through the
        // list and print each element
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> result = levelOrder(root);

        System.out.println("Level order Traversal of tree: ");

        for(List<Integer> vel : result){
            printList(vel);
        }
    }
}
