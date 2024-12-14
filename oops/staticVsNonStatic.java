package oops;
class demo1{
    static int a;
    static int b;

    int m ;
    int n;

    static {
        System.out.println("control in static block");
        a= 10;
        b= 20;
    }
    {
        System.out.println("control in non static block ");
        m = 89;
        n = 69;
    }

    static void display(){
        System.out.println("value of a and b staic is "+ a +b);
    }

    void display1(){
        System.out.println("value of m and n non static"+m +n);
    }

        }
public class staticVsNonStatic {
    public static void main(String[] args) {
       demo1 d1= new demo1();
       demo1.display();  //bcoz this is static therfore we can call it directly through class
       d1.display1();  // as it is non static therfore we have to use object for calling it

    }
}
