package TREE;
import java.util.Scanner;



public class heightOfBt {
    static Scanner sc = null;
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
        }
    }
    static Node createTree(){
        Node root = null;
        System.out.println("enter data: ");
        int data= sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);
        System.out.println("enter left for "+data);
       root.left=createTree();

        System.out.println("enter right for "+data);
        root.right=createTree();
        return root;}


        public static int height(Node root) {
            if (root == null)
                return 0;
            else {
                int leftHeight = height(root.left);
                int rightHeight = height(root.right);

                return Math.max(leftHeight, rightHeight) + 1;
            }
        }
    
    public static void main(String[] args) {
          sc= new Scanner(System.in);

        Node root = createTree();
        System.out.println("height of the tree is :"+height(root));

    }
}
