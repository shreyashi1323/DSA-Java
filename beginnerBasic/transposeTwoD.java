package beginnerBasic;
import java.util.*;
public class transposeTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]arr = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }
        //tranpose the matrix
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print( arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
