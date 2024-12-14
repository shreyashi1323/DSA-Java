package stacks;

import java.util.Stack;

public class prefixEvaluation {
    public static void main(String[] args) {
        String str= "-9/*+5346";
        Stack <Integer> st = new Stack<>();
        for(int i =str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else{
                int s1= st.pop();
                int s2 = st.pop();
                if(ch=='+') st.push(s1+s2);
                if(ch=='-') st.push(s1-s2);
                if(ch=='*') st.push(s1*s2);
                if(ch=='/') st.push(s1/s2);
            }
        }
        System.out.println(st.peek());
    }
}
