package API;
import java.util.Date;
import java.util.*;
public class DATETIME {
    public static void main(String[] args) {
               java.util.Date dt = new java.util.Date();
                System.out.println(dt);
                long timeInMs = dt.getTime();
               java.sql.Date dt1 = new java.sql.Date(timeInMs);

                System.out.println(dt1);



               //if u want to initialize date package in this way we can do it directly,,by giving the class name itself at the  time of initializing only
              // java.util.ArrayList al = new java.util.ArrayList<>();
}}
