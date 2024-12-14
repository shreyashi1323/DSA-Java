package oops;
import java.util.*;
class farmer{
    int pa;
    float td;
    float si;
    float ri;
    void input(){
      Scanner sc = new Scanner(System.in);
        System.out.println("please enter the amt required");
        pa= sc.nextInt();
        System.out.println("enter the time duration");
        td=sc.nextFloat();
        ri=4.0f;
    }

    void compute(){
        si= (pa*td*ri)/100f;
    }

    void disp(){
        System.out.println("si is "+ si);
    }
}
public class Launch_farmer {
    public static void main(String[] args) {
      farmer f1 = new farmer();
      farmer f2 = new farmer();
      f1.input();
      f1.compute();
      f1.disp();

      f2.input();
      f2.compute();
      f2.disp();
    }
}
