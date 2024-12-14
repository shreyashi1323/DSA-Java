package oops;

public class basicOops {
    public static void display(Node head) {
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static class Node{
        int data;  //value
        Node next; //address of next node
        Node(int data){
            this.data=data;
        }
    }

    public static int length(Node head) {
        int count=0;
        while(head!=null) {
            count++;
            head=head.next;
        }
        return count;

    }

    public static int lengthRecursive(Node head) {

        if (head == null) {
            return 0;
        } else {

            return 1 + lengthRecursive(head.next);
        }
    }


    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(2);
        Node e = new Node(58);
        Node f= new Node(900);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(a.next.data);
        System.out.println(a.data);

        display(a);
        System.out.println();
        System.out.println(lengthRecursive(a));
    }
}
