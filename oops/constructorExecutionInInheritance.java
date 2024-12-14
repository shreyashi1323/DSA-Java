package oops;
class trial1{
    int a , b;
    public trial1(){
        System.out.println("parent class contructor");
    }
    public trial1(int x, int y){
        System.out.println("parametrized parent class constructor");
        a=x;
        b=y;
    }
}
class trial2 extends trial1{
    int m , n;
    public trial2(){
        //super();
        this(10,20);
        System.out.println("chikd class constructor"+m+n);
    }
    public trial2(int x , int y){
        System.out.println("parameterized child class contructor" );
        m=x;
        n=y;
    }
}
public class constructorExecutionInInheritance {
    public static void main(String[] args) {
        trial2 t  =new trial2();
        trial2 t2 = new trial2(10,20);

    }
}
