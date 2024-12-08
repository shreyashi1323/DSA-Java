package interface_collections.java;

import java.util.Hashtable;

public class hashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"rohit");
        ht.put(2,"rohan");
        ht.put(3,"ramesh");
        System.out.println(ht);
        ht.putIfAbsent(2,"pop");

    }
}
