// Job sequencing Problem

import java.util.Arrays;

class Solution {
    public int[] JobScheduling(int[][] Jobs) {

        Arrays.sort(Jobs, (a, b) -> b[2] - a[2]);

        int n = Jobs.length;
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            maxDeadline = Math.max(maxDeadline, Jobs[i][1]);
        }

        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        int cnt = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = Jobs[i][1]; j >= 1; j--) {
                if (slot[j] == -1) {
                    slot[j] = Jobs[i][0]; //optional
                    cnt++;
                    totalProfit += Jobs[i][2];
                    break;
                }
            }
        }

        return new int[]{cnt, totalProfit};
    }
}