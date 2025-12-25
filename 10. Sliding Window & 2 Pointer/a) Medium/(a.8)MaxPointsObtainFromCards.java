// Maximum point you can obtain from cards

class Solution {
    public int maxScore(int[] cardScore, int k) {
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;
        int rightIndex = cardScore.length - 1;

        for (int i = 0; i < k; i++) {
            leftSum += cardScore[i];
        }
        maxSum = leftSum;

        for (int i = k - 1; i >= 0; i--) {
            leftSum -= cardScore[i];
            rightSum += cardScore[rightIndex];
            rightIndex--;

            maxSum = Math.max(maxSum, leftSum + rightSum);
        }

        return maxSum;
    }
}
