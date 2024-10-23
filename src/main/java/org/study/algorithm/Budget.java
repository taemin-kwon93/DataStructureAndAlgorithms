package org.study.algorithm;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int depart = 0;

        for (int cost : d) {
            if (budget < cost) {
                break;
            }
            budget -= cost;
            depart++;
        }

        return depart;
    }
}
