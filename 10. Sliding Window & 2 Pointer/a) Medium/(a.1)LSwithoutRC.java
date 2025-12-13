// Longest Substring Without Repeating Characters

class Solution {
    public int longestNonRepeatingSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0;
        int maxLen = 0;

        int[] hash = new int[256];

        // initialize hash with -1
        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }

        while (r < n) {
            char c = s.charAt(r);

            if (hash[c] != -1) {
                if (hash[c] >= l) {
                    l = hash[c] + 1;
                }
            }

            int len = r - l + 1;
            maxLen = Math.max(len, maxLen);

            hash[c] = r;  
            r++;
        }

        return maxLen;
    }
}
