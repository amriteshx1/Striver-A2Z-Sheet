// Program for Shortest Job First (or SJF) CPU Scheduling

import java.util.*;

class Solution {
    public long solve(int[] bt) {
        Arrays.sort(bt);
        long waitTime = 0;
        long totalTime = 0;

        for(int i = 0; i < bt.length; i++){
            waitTime += totalTime;
            totalTime += bt[i];
        }

        return waitTime / bt.length;
    }
}