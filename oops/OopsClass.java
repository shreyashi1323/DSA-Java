package oops;

public class OopsClass {
    public static class student{
        String name;
        private int rno;
        double percent;
        final String schoolname="NCHS";
        static int nos;

        //creating  constructor
		/*constructor is made inside the same class for passing  the parameters
		  or values in  one go still u can manipulate/ change the data in  main function
		  whenever u  want , its just  to ease your process of enetering  values   */
        public student(String name,  int rno, double percent) {
            this.name= name;
            this.rno= rno;
            this.percent= percent;
            nos++;
        }

        public int getrno() {
            return rno;
        }
        public void setrno(int roll) {
            this.rno=roll;
        }

    }
    public static class Car{
        String name;
        String type;
        int price;

    }

    public static void fun(student x) {
        System.out.println(x.name);
        System.out.println(x.rno);
        System.out.println(x.percent);
        return ;
    }

    public static void change(student x){
        x.name="sparrow";
        return ;
    }
    public static void main(String[] args) {

        Car c1= new Car();
        c1.name="machgan";
        c1.price= 30000000;
        c1.type="suv";
//	   System.out.println(c1.name);;
//	   System.out.println(c1.price);
//	   System.out.println(c1.type);

//
//	  student x= new student();
//	   x.name="shrey";
////    x.rno=90;
//	   x.percent=91;
//// 		 fun (x);

//	   System.out.println(x.name);
//	   change(x);
//	   System.out.println(x.name);
//	   x.setrno(76);
//	   System.out.println(x.getrno());

        student s1= new student("gopi", 76, 98);
        System.out.println(s1.nos);
        student s2= new student ("kokila" ,56,78);
        System.out.println(s2.nos);
        student s3= new student("ahemji" ,67,89);
        System.out.println(s3.nos);

    }
}
