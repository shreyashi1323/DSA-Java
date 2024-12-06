package generics;
import java.util.*;
class Student implements Comparable<Student> {
    int marks;
    int age;
    String name;
    public Student (int marks, int age, String name){

        this.marks= marks;
        this.age= age;
        this.name= name;
    }
    public int getMarks(){
        return marks;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return  name;
    }
    public String toString(){
        return ""+marks+" - "+ age + " - " + name;
    }

    public int compareTo(Student a){
        if(this.age>a.age) return 1;
        else return -1;
    }
}

//class Alpha implements Comparator<Student>{
//    public int compare(Student a, Student b){
//        if(a.marks>b.marks){
//            return 1;
//        }
//        else return -1;
//    }
//
//}
public class comparable_comparator {
    public static void main(String[] args) {
       Student st1 = new Student(45, 18, "rohan");
        Student st2 = new Student(42, 15, "nanital");
        Student st3 = new Student(20, 17, "mehu");


        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

       // Collections.sort(list); //multiple data types ke liye nhi chlta ye...//therfpre we use comparator interface


        //therfore we use comparator interface
//        Alpha a = new Alpha();
//        Collections.sort(list , a);
//        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
