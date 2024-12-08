package interface_collections.java;
import java.util.*;

public class iterator_listIterato {
    public static void main(String[] args) {
       ArrayList al = new ArrayList();
       al.add(10);
       al.add(20);
       al.add(30);
       al.add(40);
       al.add(90);
        System.out.println(al);

        //for loop
//        for(int i =0;i<al.size();i++){
//            Object o = al.get(i);
//            System.out.println(o);
//            //or
//            System.out.println(al.get(i));
//        }
//
//        //for each  loop
//        for(Object o :al){
//            System.out.println(o);
//        }

        //using iterator
        Iterator itr = al.iterator();
        while(itr.hasNext()){
          //  Integer i = (Integer) itr.next();
            System.out.println(itr.next());
        }

        System.out.println("ek iterartion khtm");

        ListIterator litr  = al.listIterator(al.size());
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

    }
}
