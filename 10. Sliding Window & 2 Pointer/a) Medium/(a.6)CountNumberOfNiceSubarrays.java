// Count number of nice subarrays

class Solution {

    public int numberOfOddSubarrays(int[] nums, int k) {
        return countAtMost(nums, k) - countAtMost(nums, k - 1);
    }

    private int countAtMost(int[] nums, int goal) {
        if (goal < 0) return 0;

        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right] % 2;

            while (sum > goal) {
                sum -= nums[left] % 2;
                left++;
            }

            count += (right - left + 1);
        }
        return count;
    }
}
