package hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public int[] twoSum1(int[] nums,int target){
        int n = nums.length;
        int [] ans= {-1};
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i =0;i<n;i++){
            int partner = target - nums[i];
            if(mp.containsKey(partner)){
                ans = new int[]{i,mp.get(partner)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        twoSum t1 = new twoSum();
        int[] nums1 = {14,7,10,4,5,9,1,2};
        int target1 = 13;
        int[] result1 = t1.twoSum1(nums1, target1);
        System.out.println(Arrays.toString(result1)); // [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = t1.twoSum1(nums2, target2);
        System.out.println(Arrays.toString(result2));

    }
}
