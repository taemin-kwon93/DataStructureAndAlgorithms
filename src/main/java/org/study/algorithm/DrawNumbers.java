package org.study.algorithm;

import java.util.*;

public class DrawNumbers {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for (int j : arr) {
            if (count == k) break;
            if (!list.contains(j)) {
                list.add(j);
                count++;
            }
        }

        for (int i = count; i < k; i++) {
            list.add(-1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
