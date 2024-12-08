package API;
enum Result{
    PASS,FAIL,NR;

    //we can make variables and constructors, methods also inside enum.
    int marks;
    Result(){
        System.out.println("contructor in enum");
    }
    void setMarks(int marks){
        this.marks= marks;
    }
    int getMarks(){
        return marks;
    }
}
public class Enum2 {
    public static void main(String[] args) {
           Result.PASS.setMarks(59);
           int m1 = Result.PASS.getMarks();
        System.out.println(m1);

//        int m2 = Result.FAIL.setMarks(1); //gives an error becoz u havent given any value to the setter of fail
//        System.out.println(m2);

        Result.NR.setMarks(90);
        int m3 = Result.NR.getMarks();
        System.out.println(m3);
    }
}
