package generics;

import java.util.ArrayList;

public class Gen1 {
    public static void main(String[] args) {
        //array promotes typesafety ..isiliye agr hum string ke alava koi type array me daalnege
        // to it will give compile time error

        String arr[] = new String [10];
        arr[0] = "hyder";
        arr[1]= "potty";
       // arr[2]= 10; //error blunder

        String name = arr[0] ;
        String name3 = arr[1];

        //no typesafetu=y is array list ...kisi bhi type ka data daal skte h
        ArrayList al = new ArrayList();
        al.add("hyder");
        al.add("name3");


    }
}
