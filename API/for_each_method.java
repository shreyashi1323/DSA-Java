package API;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Consumer;

public class for_each_method {
    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<Integer>();
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//        list1.add(6);
//        System.out.println(list1);


        //anther way of iniialising list
        List<Integer> list2 = Arrays.asList(2,4,5,8,9);
        System.out.println(list2);

//        for(Integer i :list2){
//            System.out.println(i);
//        }

      //  Consumer<Integer> cons = i-> System.out.println(i);

        //forEach is an inbuilt method to print your data easily snd faster
        list2.forEach(n-> System.out.println(n));
    }


}
