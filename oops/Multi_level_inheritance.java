package oops;
class trial {
    void disp(){
        System.out.println("disp written in demo1 class");
    }
}
class demo2 extends trial {

}
class demo3 extends demo2{

}
public class Multi_level_inheritance {
    public static void main(String[] args) {
       demo3 d = new demo3();
       d.disp();
    }
}
