// Fractional Knapsack Problem

import java.util.*;

class Solution {

    static class Item {
        int value, weight;

        Item(int v, int w) {
            value = v;
            weight = w;
        }
    }

    public double fractionalKnapsack(int[] val, int[] wt, long cap) {

        int n = val.length;
        Item[] arr = new Item[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Item(val[i], wt[i]);
        }

        Arrays.sort(arr, (a, b) -> {
            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2, r1);
        });

        double totalVal = 0.0;

        for (int i = 0; i < n; i++) {
            if (arr[i].weight <= cap) {
                totalVal += arr[i].value;
                cap -= arr[i].weight;
            } else {
                totalVal += ((double) arr[i].value / arr[i].weight) * cap;
                break;
            }
        }

        return totalVal;
    }
}
