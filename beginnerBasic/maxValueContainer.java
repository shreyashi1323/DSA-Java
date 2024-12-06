package beginnerBasic;
import java.util.*;
public class maxValueContainer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }

        int prod =1;
        int maxP= Integer.MIN_VALUE;
        int l =0, r = n-1;
        while(l<r){
            int small = Math.min(arr[l], arr[r]);
            prod =small *(r-l);
            maxP = Math.max(maxP, prod);
            l++;
        }


        System.out.println(maxP);

    }
}
