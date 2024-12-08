package API;

enum Week{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}
public class Enum {
    enum result{
        PASS,FAIL,NR   //uppercase recommended but can write in any format
    }
    public static void main(String[] args) {
         Week w = Week.MON;
        System.out.println(w);

        int index = Week.MON.ordinal();  //ordinal is a method to get all indexes of all values
        System.out.println(index);

        Week [] wr = Week.values();{
            for(Week w1:wr){
                System.out.println(w1+" :"+w1.ordinal());
            }
        }

        result r = result.PASS;
        System.out.println(r);
    }
}
