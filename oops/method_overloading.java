package oops;

class calc{
    public int  add(int n1, int n2){
        int result = n1+ n2;
        return result;
    }

    public int  add(int n1, int n2,int n3){
        int result = n1+ n2+ n3;
        return result;
    }

    public double add(double n1, double n2){
        double result = n1+n2;
        return result;
    }
}

public class method_overloading {
    public static void main(String[] args) {
       calc obj = new calc();
       int result = obj.add(4,3);
        int res = obj.add(4,3,5);
        double res2 = obj.add(3.8, 5.6);
        System.out.println(result);
        System.out.println(res);
        System.out.println(res2);
    }
}
