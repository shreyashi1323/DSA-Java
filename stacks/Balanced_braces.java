package stacks;
import java.util.*;
import java.util.Stack;
public class Balanced_braces {
   /* public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();

            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String str= sc.nextLine();
        System.out.println(isBalanced(str));*/


    public static void main(String[] args) {
        int [] arr = {1,5,3,2,1,6,3,4};
        int [] res = new int[arr.length];
        Stack<Integer>st = new Stack<>();
        int n = arr.length;
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i =n-2;i>=0;i--){

           while(st.peek()<arr[i] && !st.isEmpty())
               st.pop();

           if(st.isEmpty()) res[i] = -1;
           else res[i] = st.peek();
           st.push(arr[i]);
        }

    }

}
