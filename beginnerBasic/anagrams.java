package beginnerBasic;
import java.util.*;
public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            boolean ans = Arrays.equals(c1, c2);
            if (ans) System.out.println("yes anagram");
        else System.out.println(" no");
    }
        else{
            System.out.println("no anagram");
        }

    }
}
