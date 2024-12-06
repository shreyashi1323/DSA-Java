package generics;

import java.io.*;

class cricketer implements Serializable {
    private String name;
    private int age;
    private int runs;

    public cricketer(String name, int age, int runs){
        this.name= name;
        this.age= age;
        this.runs= runs;
    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}
public class serialisation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        cricketer  c = new cricketer("sachin",45,5900);
        c.disp();
//        FileOutputStream fos = new FileOutputStream("pw.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        ObjectOutputStream oos = new ObjectOutputStream(bos);
//        oos.writeObject(c);
//        oos.flush();
//        oos.close();


        //process of deserilization
        FileInputStream fis = new FileInputStream("pw.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        cricketer cr = (cricketer)ois.readObject();
        cr.disp();

        ois.close();
    }
}
