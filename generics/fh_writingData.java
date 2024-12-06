package generics;
import java.io.*;
public class fh_writingData {
    public static void main(String[] args) throws IOException{
        File dir = new File("sparrow");
        File file = new File(dir,"pw.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
       // FileWriter fw = new FileWriter(file,true); //true likhne se override nhi hota...
        fw.write("\n");
        fw.write("PW   ");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        char ch []= {'r','i','g','h','t'};
        fw.write(ch);
//        fw.close();
        fw.flush();
        System.out.println("open pw.txt to see result");

    }
}
