package stacks;
import java.util.Stack;
import java.util.Scanner;

public class revrse_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Stack<Integer> st = new Stack<>();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        /*Stack <Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);

        Stack <Integer> qt = new Stack<>();
        while(rt.size()>0){
            qt.push(rt.pop());
        }
        System.out.println(qt);

        while(qt.size()>0){
            st.push(qt.pop());
        }
        System.out.println(st);*/

        //reversing stack recursively

    }
}
