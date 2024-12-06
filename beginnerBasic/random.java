package beginnerBasic;
import java.util.*;
public class random {

    public static void main(String[] args) {
        int [] target ={392,360};
        int [] arr= {360, 392};
        boolean ans = canBeEqual(target, arr);
        System.out.println(ans);

    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length) return false;
        Arrays.sort(arr);
        Arrays.sort(target);
        int count=0;
        if(target.length==arr.length){
            for(int i =0;i<target.length;i++){
                if(target[i]==arr[i] ) count++;
            }
        }

        if(count==target.length) return true;
        return false;
    }
}
