package oops;
class aeroplane{
    public void takeoff(){
        System.out.println("aeroplane is taking off");
    }
    public void fly(){
        System.out.println("aeroplane is flying");
    }
}
class cargo extends aeroplane{
    //overriding fly method
    public void fly(){
        System.out.println("cargo flies at lower height");
    }
    public void carryGoods(){
        System.out.println("cargo plane carries goods");
    }
}
class passenger extends aeroplane{
    public void fly(){
        System.out.println("passenger flies at mid height");
    }
    public void carrypassenger(){
        System.out.println("cargo plane carries passengers");
    }
}
public class overriding_in_inheritance {
    public static void main(String[] args) {
      passenger p = new passenger();
      p.carrypassenger();
      p.fly();
      p.takeoff();
    }
}
