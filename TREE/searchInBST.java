package TREE;
import java.util.Scanner;

public class searchInBST {
    static Scanner sc = new Scanner(System.in);

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    static Node createTree() {
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if (data == -1) return null;

        Node root = new Node(data);
        System.out.println("Enter left data for " + data + ":");
        root.left = createTree();
        System.out.println("Enter right data for " + data + ":");
        root.right = createTree();
        return root;
    }

    static void printPreorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (root.data > key) { // search in left subtree
            return search(root.left, key);
        } else { // search in right subtree
            return search(root.right, key);
        }
    }

    public static void main(String args[]) {
        Node root = createTree();
        if (root == null) {
            System.out.println("Tree is empty!");
        } else {
            System.out.println("The root node is = " + root.data);
            printPreorder(root);

            int key = 7; // Example key to search
            if (search(root, key)) {
                System.out.println("\n" + key + " found");
            } else {
                System.out.println("\n" + key + " not found");
            }
        }

    }
}
