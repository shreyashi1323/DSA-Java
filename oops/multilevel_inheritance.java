package oops;
class Animal{
    void disp(){
        System.out.println("animal ko meat pasand hota hai!!");
    }
}
class tiger extends Animal{

}
class lion extends Animal{

}
class leopard extends Animal{

}
public class multilevel_inheritance {
    public static void main(String[] args) {
        leopard l = new leopard();
        l.disp();
    }
}
