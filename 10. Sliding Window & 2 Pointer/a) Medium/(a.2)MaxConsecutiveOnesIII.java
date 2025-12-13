// Max Consecutive Ones III

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int zeros = 0;

        while(r < n){
            if(nums[r] == 0) zeros++;
            if(zeros > k){
                if(nums[l] == 0) zeros--;
                l++;
            }
            if(zeros <= k){
                int length = r - l + 1;
                maxLength = Math.max(length, maxLength);
            }
            r++;
        }
        return maxLength;
    }
}