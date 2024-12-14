package oops;
 class animal1{
   final void sleep(){
        System.out.println("animal is sleeping");
    }
}
class tiger2 extends animal1{

}
public class finalKey {
    public static void main(String[] args) {
         tiger2 t = new tiger2();
         t.sleep();
    }
}
