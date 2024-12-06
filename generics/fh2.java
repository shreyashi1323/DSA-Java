package generics;
import java.io.*;
import java.io.IOException;

public class fh2 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        File f = new File("src","generics");

        //to print all the files and count of files
        String str[]= f.list();
        for(String name: str){
            count++;
            System.out.println(name);
        }
        System.out.println(count);
    }
}
