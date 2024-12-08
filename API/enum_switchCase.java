package API;
enum Result1{
    PASS,FAIL,NR;
}
public class enum_switchCase {
    public static void main(String[] args) {
        Result1 res = Result1.PASS;
        switch(res){
            case PASS:
                System.out.println("passed");
                break;
            case FAIL:
                System.out.println("failed");
                break;
            case NR:
                System.out.println("no result");
                break;
        }
    }
}
