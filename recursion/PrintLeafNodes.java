package recursion;

import java.util.List;

public class PrintLeafNodes {
    static class Node {
        private int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        List<Integer> dataInput = List.of(100, 80, 50, 90, 30, 60, 90, 85, 95, 120, 110, 108, 115, 140, 150);

        Node root = null;
        for (Integer node : dataInput) {
            root = insertNode(root, node);
        }
        printLeaves(root);
    }

    public static void printLeaves(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.println(root.val);
            return;
        }

        if (root.left != null) {
            printLeaves(root.left);
        }
        if (root.right != null) {
            printLeaves(root.right);
        }
    }

    public static Node insertNode(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }

        return root;
    }

}
