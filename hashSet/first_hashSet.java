package hashSet;

import java.util.HashSet;

public class first_hashSet {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("james");
        st.add("james");
        st.add("lasan");
        st.add("loda");
        System.out.println(st);
        st.remove("loda");

        System.out.println(st.contains("lodu"));
        System.out.println(st.size());
        System.out.println(st);
        System.out.println("shreyy");
        for(String s : st){
            System.out.println(s);
        }
    }
}
