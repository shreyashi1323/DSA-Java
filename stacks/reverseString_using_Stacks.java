package stacks;

import java.util.Stack;

public class reverseString_using_Stacks {
    void reverseSen(String s) {
        Stack<String> st = new Stack<>();
        String[] words = s.split("\\s+");

        for (String word : words) {
            st.push(word);
        }

        while (!st.empty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
        //System.out.println();
    }

    public static void main(String[] args) {
        reverseString_using_Stacks reverseStringUsingStacks = new reverseString_using_Stacks();
        String s = "Hello, how are you doing?";
        reverseStringUsingStacks.reverseSen(s);
    }
}
