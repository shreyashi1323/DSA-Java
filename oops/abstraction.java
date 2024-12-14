package oops;
import java.util.*;
//aise class jiski koi body na ho use abstract declare krna hota h..vo abstract clss hoti h
//abstract class ka object java m nhi bna skte

//there is no abstract variable nor abstract constructor
abstract class aeroplane2{
    abstract public void takeoff();
    abstract public void fly();
    //impure abstraction:bcoz of no abstract keyword
     public void landing(){
        System.out.println("aeroplane is landing");
    }
}
class cargo2 extends aeroplane2 {
    //overriding fly method
    public void takeoff(){
        System.out.println("cargo plane requires longer runway");
    }
    public void fly(){
        System.out.println("cargo flies at lower height");
    }
    public void carryGoods(){
        System.out.println("cargo plane carries goods");
    }
    public void alert(){
        System.out.println("alert");
    }
}
class passenger2 extends aeroplane2 {
    public void takeoff(){
        System.out.println("passenger plane requires medium runway");
    }
    public void fly(){
        System.out.println("passenger flies at mid height");
    }
    public void carrypassenger(){
        System.out.println("passenger plane carries passengers");
    }
}
/*class fighter2 extends aeroplane2{
    public void fly() {
        System.out.println(" fighter plane flies at hih heights");
    }
    public void carrysoldiers(){
        System.out.println("they carry soldiers");
    }
}*/

class airport2{
    public void poly(aeroplane2 ref){
        ref.takeoff();
        ref.fly();

        System.out.println("*********************");
    }
}
public class abstraction {
    public static void main(String[] args) {
       aeroplane2 ref1 = new cargo2();
       ref1.takeoff();
       ref1.fly();
       ref1.landing();

       //downcasting to use the andr vale class
        ((cargo2)ref1).alert();
       aeroplane2 ref3 = new passenger2();
       ref3.takeoff();
       ref3.fly();
        ref3.landing();
    }
}


