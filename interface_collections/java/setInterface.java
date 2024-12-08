package interface_collections.java;

import java.util.HashSet;

public class setInterface {
    public static void main(String[] args) {
        HashSet< Integer> st =  new HashSet<>();

        //set  is com pletly unordered kisi bhi sequence me elements store and print hote h
        //internally  ek  hashing  bhi geenrate hoti hai

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);
        st.add(1);
        st.add(2);
        // set duplicate elemnst nhi rkhta
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(2)); //false
        System.out.println(st.size()); //2
        System.out.println(st);  //1 3
    }
}
