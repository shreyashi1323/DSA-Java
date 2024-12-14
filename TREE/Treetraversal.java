package TREE;

import com.sun.source.tree.BinaryTree;
import java.util.*;
import java.util.List;

import static TREE.Treetraversal.BinaryTree.postOrder;

public class Treetraversal {
    static  class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }}
    static  class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            //hrr node ka crete hone ke baad recursivly uska left or right child node print ho jaaega
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
        public static void postOrder(Node root){
            if(root==null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    //preOrdertraversal
    public static void preorder(Node root){  //Tc=O(n)
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }

    //inordertraversal
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //level order traversal
    public static void LevelOrder(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null); // Add a marker for the next level
                }
            } else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println("level order traversal");
        LevelOrder(root);
    }
}
