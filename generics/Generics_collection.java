package generics;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Generics_collection {
    public static void main(String[] args) {
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("PW");
        al2.add("hyder");
        al2.add("op");

        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);

        ArrayList al3 = new ArrayList();
        al3.add(100);
        al3.add(150);
        al3.add(160);
        al3.add(250);
        al3.add(250);

        System.out.println(al3);
        int index = Collections.binarySearch(al3,50);
        System.out.println("index is :"+index);

        Collections.rotate(al3, 2);
        System.out.println(al3);

        Collections.shuffle(al3);
        System.out.println(al3);

        System.out.println(Collections.frequency(al3,250));
    }
}
