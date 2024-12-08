package hashSet;

import java.util.HashMap;
import java.util.HashSet;

public class longestConsecutiveElements {
    public static int  longestConsecutive(int[] nums){
        HashSet<Integer> st  = new HashSet<>();
        for(int num:nums) st.add(num);
        int  maxstreak =0;
        for(int num:st){
            if(!st.contains(num-1)){
                int  currNum = num;
                int  currStreak=  1;
                while(st.contains(currNum +1)){
                    currStreak++;
                     currNum++;
                }
                 maxstreak = Math.max(maxstreak,currStreak);
            }
        }
        return maxstreak;
    }
    public static void main(String[] args) {
        longestConsecutiveElements hp = new longestConsecutiveElements();
        int [] nums = {100,1,2,3,200,4};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }
}
