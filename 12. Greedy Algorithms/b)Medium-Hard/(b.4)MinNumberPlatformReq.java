// Minimum number of platforms required for a railway
import java.util.Arrays;

class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        int n = Arrival.length;
        int i = 0;
        int j = 0;
        int cnt = 0;
        int maxCnt = 0;

        while(i < n && j < n){
            if(Arrival[i] <= Departure[j]){
                cnt++;
                i++;
            }else{
                cnt--;
                j++;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }
        return maxCnt;
    }
}