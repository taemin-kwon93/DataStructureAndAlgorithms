package org.study.algorithm;

import java.util.*;

public class CircularSubsequenceSumCount {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int len = elements.length;
        for(int i = 1; i <= len; i++) {
            for(int j = 0; j <= len; j++) {
                int sum = 0;
                for(int k = j; k < j + i; k++)
                    sum += elements[k % len];
                set.add(sum);
            }
        }
        return set.size();
    }

}
