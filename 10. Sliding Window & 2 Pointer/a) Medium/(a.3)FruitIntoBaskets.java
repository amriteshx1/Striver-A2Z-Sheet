// Fruit Into Baskets

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalFruits(int[] fruits) {
        int n = fruits.length;
        int l = 0, r = 0;
        int maxLength = 0;
        int k = 2;

        Map<Integer, Integer> mpp = new HashMap<>();

        while (r < n) {
            mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0) + 1);

            while (mpp.size() > k) {
                mpp.put(fruits[l], mpp.get(fruits[l]) - 1);
                if (mpp.get(fruits[l]) == 0) {
                    mpp.remove(fruits[l]);
                }
                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }

        return maxLength;
    }
}
