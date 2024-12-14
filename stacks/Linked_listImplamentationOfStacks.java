package stacks;

public class Linked_listImplamentationOfStacks {
    public static class Node{  //user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LLStack{  //user defined data structure
       private Node head = null;
       private int size=0;
       void push(int x) {
           Node temp = new Node(x);
           temp.next = head;
           head = temp;
           size++;
       }

       void displayRev(){
          Node temp = head;
          while(temp!=null){
              System.out.print(temp.val+" ");
              temp = temp.next;
          }
           System.out.println();
        }

        void displayrec(Node h){
           if(h==null)  return ;
           displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
           displayrec(head);
            System.out.println();
        }
        int size(){  //getter
           return size;
        }

        int pop(){
           if(head==null){
               System.out.println("stack is empty !!");
               return -1;
           }
           int x = head.val;
           head= head.next;
           return x;
        }

        int peek(){
           if(head==null){
               System.out.println("stack khaali hai!!");
               return -1;

           }
           return head.val;
        }
        boolean isEmpty(){
          if(size==0) return true;
          return false;
        }
    }

    public static void main(String[] args) {
       LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(9);
        st.push(0);
        System.out.println("Our stack looks like this:");
        st.display();
        st.displayRev();
        System.out.println(st.isEmpty());
        st.push(100);
        st.display();
        //System.out.println(st.capacity());
    }
}
