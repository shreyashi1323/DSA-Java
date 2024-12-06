package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class firstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        try{
             n = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("enter a number!");
        }
        // to close the resorce in any case we should use finally block
        //it doesnt matter whether try / catch block executes or not...at the end we have some main motives that are required to be done..thefore we should use finally block
        finally {
            sc.close();
            System.out.println("resource closed!");
        }
        System.out.println(n);
    }
}
