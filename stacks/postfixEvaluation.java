package stacks;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;
import java.util.*;
public class postfixEvaluation {
    public static void main(String[] args) {
        String str= "953+4*6/-";
        Stack <Integer> val = new Stack<>();
        for(int i =0;i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
            int s1= val.pop();
            int s2 = val.pop();
            if(ch=='+') val.push(s2+s1);
            if(ch=='-') val.push(s2-s1);
            if(ch=='*') val.push(s2*s1);
            if(ch=='/') val.push(s2/s1);
        }}
        System.out.println(val.peek());
    }
}
