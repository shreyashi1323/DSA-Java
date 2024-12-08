package interface_collections.java;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> st = new TreeSet<>();
        //treeset is always sorted
        //internally it uses self balancing tree
        //BST , red block tree
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(34);
        st.add(18);
        st.add(10);
        System.out.println(st);
        System.out.println(st.ceiling(19));
        System.out.println(st.floor(19));
        System.out.println(st.higher(34));
        System.out.println(st.lower(34));

    }
}
