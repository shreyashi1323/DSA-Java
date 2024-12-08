package API;

//it is a functional interface
@FunctionalInterface

//as soon as we include functionalinteface annotation it tells us the
// error in the code that this class can only have onr abstract method

interface demo{
    void disp();
//    void disp2();
}
abstract class plane{
    public void planefliesAtGoodHeight() {
        System.out.println("plane is flying ");
    }
}

//this is child class or subclass
class cargplane extends plane{

    //ovveriding a subclass
      public void planefliesAtGoodHeight(){
          System.out.println("cargo plane at low hide");
      }
}
public class annotation {
    public static void main(String[] args) {

        //object of child class
        plane cp = new cargplane();
        cp.planefliesAtGoodHeight();
    }
}
