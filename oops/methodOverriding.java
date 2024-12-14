package oops;
import java.util.*;
class animal{
 public void eat(){
     System.out.println("animal eats everyday");
 }
 public void age(){
     System.out.println("anima age");
 }
}
class tiger1 extends animal{
  public void eat(){
      System.out.println("tiger huts and eat");
  }
}
public class methodOverriding {
    public static void main(String[] args) {
    tiger1 t = new tiger1();
    t.eat();
    }
}
