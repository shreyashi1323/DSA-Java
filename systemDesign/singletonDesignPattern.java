package systemDesign;

public class singletonDesignPattern {
    //constructor is used to create objects
    private singletonDesignPattern(){
        //constructor
    }

    public static singletonDesignPattern getSingleton(){
        singletonDesignPattern single = new singletonDesignPattern();
        return single;
    }
    public static void main(String[] args) {

    }
}
