package hashmaps;

import java.util.HashMap;
import java.util.*;
public class most_frequent_element_in_an_array {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,1,4,4,6,4,4,4};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int el :arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else{
              freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println("frequency map");
        System.out.println(freq.entrySet());

        int mxFreq = 0, anskey = -1;
        for(var e: freq.entrySet()){
            if(e.getValue()>mxFreq){
                mxFreq = e.getValue();
                anskey = e.getKey();

            }
        }
        System.out.println(anskey);
    }
}
