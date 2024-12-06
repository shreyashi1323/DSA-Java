//package backtracking;
//
//import java.util.ArrayList;
//import java.util.*;
//public class printPermutations {
//    public static void printp(String str, String t,List<String>l){
//        if (str.equals("")) {
//            l.add(t);
//           // System.out.println(t);
//            return;
//        }
//        for(int i =0;i<str.length();i++){
//            char ch = str.charAt(i); //b
//            String left =str.substring(0,i); //a
//            String right = str.substring(i+1); //c
//            String rem = left+right;
//            printp(rem,t+ch,l);
//        }
//    }
//    public static void main(String[] args) {
//        String str ="abc";
//
//
//        for(int i=0;i<l.size();i++){
//            System.out.println(l.get(i));
//        }
//    }
//}
