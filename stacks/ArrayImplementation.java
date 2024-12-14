package stacks;

public class ArrayImplementation {
    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full !");
                return;
            }
            arr[idx++] = x;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty !");
                return -1;
            }
            int top = arr[--idx];
            arr[idx] = 0;
            return top;
        }

        boolean isEmpty() {
            return idx == 0;
        }

        boolean isFull() {
            return idx == arr.length;
        }

        int capacity(){
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
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
        System.out.println(st.isFull());
        st.push(100);
        st.display();
        System.out.println(st.capacity());
    }
}
