// Longest Substring with At Most K Distinct Characters

import java.util.*;

class Solution {
    public int kDistinctChar(String s, int k) {
        if (k == 0 || s.length() == 0) return 0;

        int l = 0, r = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (r < s.length()) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}
