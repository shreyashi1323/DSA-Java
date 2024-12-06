package generics;
import java.util.*;
class Gen<T>{
    T obj;
    public Gen(T obj){
        this.obj= obj;

    }
    void disp(){
        System.out.println("the type of data is :"+obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }
}
public class Gen2 {
    public static void main(String[] args) {

        Gen<Integer> g = new Gen<Integer>(10);
        g.disp();
        System.out.println( g.getObj());

        System.out.println("*************************");

        Gen<String> g1 = new Gen<String>("shreyy");
        g1.disp();
        System.out.println( g1.getObj());


    }
}
