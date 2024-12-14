package TREE;

class AVL {
    static class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
            this.height = 0; // Initialize height as 0
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // Update the height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Balance the tree
        return rotate(node);
    }

    private Node rotate(Node node) {
        // Check balance factor
        int balance = height(node.left) - height(node.right);

        // Left-heavy cases
        if (balance > 1) {
            if (height(node.left.left) >= height(node.left.right)) {
                // Left-Left case
                return rightRotate(node);
            } else {
                // Left-Right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // Right-heavy cases
        if (balance < -1) {
            if (height(node.right.right) >= height(node.right.left)) {
                // Right-Right case
                return leftRotate(node);
            } else {
                // Right-Left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node; // Node is already balanced
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        // Update heights
        p.height = 1 + Math.max(height(p.left), height(p.right));
        c.height = 1 + Math.max(height(c.left), height(c.right));

        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        // Update heights
        c.height = 1 + Math.max(height(c.left), height(c.right));
        p.height = 1 + Math.max(height(p.left), height(p.right));

        return p;
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    public void display(Node node, String details) {
        if (node == null) return;
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + ": ");
        display(node.right, "Right child of " + node.value + ": ");
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int height(Node node) {
        return (node == null) ? -1 : node.height;
    }

    public int height() {
        return height(root);
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) return true;
        int balance = Math.abs(height(node.left) - height(node.right));
        return balance <= 1 && balanced(node.left) && balanced(node.right);
    }
}

public class AVLTrees {
    public static void main(String[] args) {
        AVL tree = new AVL();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println("Height of the AVL tree: " + tree.height());
    }
}
