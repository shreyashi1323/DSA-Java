package oops;
class Student1{
    private String name;
    private int age;

    public Student1(){
        System.out.println("default constructor is called");
        name = "rohan";
        age= 18;
    }
    public Student1(String name){
        this.name= name;
        age = 29;
    }
    public Student1(String name, int age){
        this.name= name;
        this.age= age;
    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.disp();
        Student1 st2 = new Student1("shreyy");
        st2.disp();
        Student1 st3 = new Student1("sparrow", 18);
        st3.disp();

    }
}
