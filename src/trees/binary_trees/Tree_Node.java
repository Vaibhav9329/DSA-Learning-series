package trees.binary_trees;


import java.util.Scanner;

public class Tree_Node {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
        private Node root;

        //insert element
        public void populate(Scanner scanner) {
            System.out.println("enter the root node: ");
            int value = scanner.nextInt();
            root = new Node(value);
            populate(scanner, root);
        }

        private void populate(Scanner scanner, Node noderoot) {
            System.out.println("Do you want to enter left of " + noderoot.value);
            boolean left = scanner.nextBoolean();
            if (left) {
                System.out.println("Enter the value of the left of " + noderoot.value);
                int value = scanner.nextInt();
                noderoot.left = new Node(value);
                populate(scanner, noderoot.left);
            }

            System.out.println("Do you want to enter right of " + noderoot.value);
            boolean right = scanner.nextBoolean();
            if (right) {
                System.out.println("Enter the value of the right of " + noderoot.value);
                int value = scanner.nextInt();
                noderoot.right = new Node(value);
                populate(scanner, noderoot.right);
            }

        }

//        public void display() {
//            display(this.root, "");
//        }
//
//        private void display(Node node, String indent) {
//            if(node == null){
//                return;
//            }
//
//            System.out.println(indent + node.value);
//            display(node.left, indent + "\t");
//            display(node.right, indent + "\t");
//        }

        public void pretyDisplay(){
            prettyDisplay(root, 0);
        }
    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    public void preOrder(){
            preOrder(root);
    }
    private static void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node);
        preOrder(node.left);
        preOrder(node.right);
    }



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Tree_Node  tree = new Tree_Node();
            tree.populate(sc);
            tree.pretyDisplay();
        }

}
