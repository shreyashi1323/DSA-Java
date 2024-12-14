package stacks;
import java.sql.SQLOutput;
import java.util.Stack;
import java.util.Scanner;
public class copy_stack {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
       Stack<Integer> st= new Stack<>();
        System.out.println("enter the elements you want ");
        int n= sc.nextInt();
        System.out.println("enter the elements");
        for(int i=1;i<=n;i++){
           int x= sc.nextInt();
           st.push(x);
        }
        System.out.println(st);

        //printing the stack in reverse
        Stack<Integer> rt= new Stack<>();
        while(st.size()>0){
//            int x= st.peek();
//            rt.push(x);
//            st.pop();
            rt.push(st.pop());
        }
        System.out.println(rt);

        //priting the exact copy of the entered elements in thew stack
        Stack<Integer> gt = new Stack <>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
