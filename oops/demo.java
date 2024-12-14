package oops;

class Student{
        private int age;
        private String name;

        Student(String name, int age){
            this.name= name;
            this.age= age;
        }
        public void setAge(int age ){
            this.age = age;
        }
        public void setName(String name){
            this.name=name;
        }
        public int getAge(){
            return age;
        }

         public String getAge(String name){
            return name;
         }
        public void display(){
            System.out.println(name+" "+age);
        }
}
public class demo {

    public static void main(String[] args) {
        Student obj = new Student("rahul",89);
        Student obj1= new Student("shreyy", 90);
        //obj.name= "shreyy";
        //obj.age= 19;
        /*obj.setAge(19);
        obj1.setAge(12);
        obj.setName("shreyy");
        obj1.setName("sparrow");*/
        obj.display();
        obj1.display();
        int stud1Age = obj.getAge();
        System.out.println(stud1Age);
    }
}
