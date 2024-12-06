package hashmaps;

import java.util.HashMap;
import java.util.*;

public class largestSubarrayWithZeroSum {
    int zeroSumSubArray(int [] arr, int n){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int maxLen = 0,presum=0;
        mp.put(0,-1);
        for(int i =0;i<arr.length;i++){
            presum+=arr[i];
            if(mp.containsKey(presum)){
                maxLen=Math.max(maxLen,i-mp.get(presum));
            }
            else{
                mp.put(presum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        largestSubarrayWithZeroSum l1 = new largestSubarrayWithZeroSum();
        int []  a = {15,-2,2,-8,1,7,10,-25};
        int [] result= new int[]{l1.zeroSumSubArray(a, 8)};
        System.out.println(Arrays.toString(result));
    }
}
