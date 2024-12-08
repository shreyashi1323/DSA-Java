package interface_collections.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class listInterfaceExamples {
    static void ArrayListExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1)); //konsi index pr konsi value pdi hai
        l.set(1,10); //modify at index 1
        System.out.println(l);
        System.out.println(l.contains(10));
    }
    static void  linkedlistExamples(){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);
        System.out.println(l1.get(1)); //konsi index pr konsi value pdi hai
        l1.set(1,10); //modify at index 1
        System.out.println(l1);
        System.out.println(l1.contains(10));
    }
    static void StackExamples(){
        Stack<String> st = new Stack<>();
        st.push("shreyy");
        st.push("will");
        st.push("buy");
        st.push("mercedes maybach");
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.empty());
    }
    public static void main(String[] args) {
        // ArrayListExamples();
        //linkedlistExamples();
        StackExamples();
    }
}
