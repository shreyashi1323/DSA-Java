package interface_collections.java;

import java.util.HashMap;
import java.util.*;

public class mapinterface {
    public static void main(String[] args) {
     Map <Integer,String> mp = new HashMap<>();
     //hashmaps are unorederd
        // linkd list maps are orderd
        // tree maps me sorted hoga acc to keys
     mp.put(3,"Aman");
     mp.put(1,"Rohan");
     mp.put(2,"shreyy");
     mp.put(1,"priya");  //it will override the first key element
        mp.putIfAbsent(1,"sparrow"); //only will override if nothing is present ont that place

        //iterating over keys in a map
        for(Integer i : mp.keySet()){
            System.out.print(i+" ");
        }


        //interating over values in a map
        for(String i : mp.values()){
            System.out.println(i+" ");
        }

        //iterating over keys ,value mapping
        for(var e : mp.entrySet()){
            System.out.println(e.getValue());
            System.out.println(e.getKey());
        }




//        System.out.println(mp);
//        System.out.println(mp.get(2));
//        System.out.println(mp.containsKey(4));
//        System.out.println(mp.containsValue("shreyy"));
//        System.out.println(mp.entrySet());
//        System.out.println(mp.keySet());
//        System.out.println(mp.values());
    }
}
