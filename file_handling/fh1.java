package file_handling;
import java.io.*;

public class fh1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("shreyy.txt");
        System.out.println(file1.exists());

        //to create new file
        file1.createNewFile();
        System.out.println(file1.exists());

        //for directory
        File dir = new File("sparrow");
        System.out.println(dir.exists());

        //to create a directory
        dir.mkdir();
        System.out.println(dir.exists());
        System.out.println("dir is referring to directory :"+dir.isDirectory());

        System.out.println(dir.isDirectory());
        File file = new File(dir, "pwskill.txt");
        System.out.println(file.isFile());

        //to create file in a directory
        file.createNewFile();
        System.out.println(file.isFile());

    }
}
