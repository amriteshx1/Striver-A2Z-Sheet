// Subarray with k different integers

import java.util.*;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithAtmostKDistinct(nums, k) - subarraysWithAtmostKDistinct(nums, k - 1);
    }

    private int subarraysWithAtmostKDistinct(int[] nums, int k){
        int l = 0;
        int r = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while(r < nums.length){
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while(map.size() > k){
                map.put(nums[l], map.get(nums[l]) - 1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }
}