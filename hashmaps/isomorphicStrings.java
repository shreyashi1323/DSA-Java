package hashmaps;

import java.util.HashMap;

public class isomorphicStrings {
    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> mp = new HashMap<>();
        for(int i =0;i<s.length();i++){
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);
            if(mp.containsKey(sch)){
                if(mp.get(sch)!=tch) return false;

            }else if (mp.containsValue(tch)){
                return false;
            } else {
                mp.put(sch,tch);
            }

        }
        return true;
    }
    public static void main(String[] args) {

        isomorphicStrings  isomorphicStrings = new isomorphicStrings();

        // Test cases
        System.out.println(isomorphicStrings.isIsomorphic("egg", "add")); // true
        System.out.println(isomorphicStrings.isIsomorphic("foo", "bar")); // false
        System.out.println(isomorphicStrings.isIsomorphic("paper", "title")); // true
        System.out.println(isomorphicStrings.isIsomorphic("ab", "aa"));
    }
}
