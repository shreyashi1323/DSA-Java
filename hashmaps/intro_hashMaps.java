package hashmaps;

import java.util.HashMap;
import java.util.*;

public class intro_hashMaps {
    static void HashMapMethods(){
        Map<String,Integer> mp = new HashMap<>();
        //Adding elements
        mp.put("akash",21);
        mp.put("yash", 16);
        mp.put("lav", 17);
        mp.put("rishika",19);
        mp.put("harry",18);
        System.out.println(mp);

        //getting value of a key in hashmap
        System.out.println(mp.get("yash")); //16
        System.out.println(mp.get("rahul")); //null

        //changing and updating value of a key in the hashmap
        mp.put("akash",25);
        System.out.println(mp);

        //remove a pair from hash map
        //mp.remove("akash");
        System.out.println(mp.remove("akash")); //25
        System.out.println(mp.remove("riya")); //null

        //cjecking if a key is available in the hashmaps
        System.out.println(mp.containsKey("akash")); //fasle
        System.out.println(mp.containsKey("yash")); //true

        //adding a new entry  only if the new key doesn't exist already
        mp.putIfAbsent("yash", 30); //will not enter
        mp.putIfAbsent("yashika", 30); //will enter

        //get all the keys in  the hashmap
        System.out.println(mp.keySet());

        //get all the values in the hashmaps
        System.out.println(mp.values());

        //get all the entries in the hashmap
        System.out.println(mp.entrySet());

        //traversing all entries of hashmap - multiple methods
        for (String key : mp.keySet())
        {
            System.out.printf("age of %s is %d\n", key , mp.get(key));
        }
        System.out.println();

        for (Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();

        for(var e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
    public static void main(String[] args) {
       HashMapMethods();
    }
}
