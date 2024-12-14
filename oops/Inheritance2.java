import java.util.*;
class human{
    int age;
    private String name;
    /*human(){
        System.out.println("human class contructor");
    }*/
    void sleep(){
        age = 18;
        System.out.println("human needs a good sleep");
        System.out.println(age);
    }
}
class student extends human{
    student()
    {}
    void disp(){
        System.out.println("the age is :"+age);
        //System.out.println("the name is :"+name);
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        student st = new student();
        st.disp();
        st.sleep();

     }
}
