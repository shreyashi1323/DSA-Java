package generics;
import java.io.*;
public class fh_reader {
    public static void main(String[] args) throws Exception{
        File dir = new File("sparrow");
        File file = new File(dir, "pw.txt");
//
//        FileWriter fw = new FileWriter(file);
//        BufferedWriter bw = new BufferedWriter(fw);

//        bw.write("java");
//        bw.newLine();
//        bw.write(65);
//        char ch[]={'j','a','c','k'};
//        bw.write(ch);
//        bw.close();

        // to read all data from file
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line= br.readLine();
        while(line!=null){
            System.out.println(line);
            line = br.readLine();
        }


    }
}
