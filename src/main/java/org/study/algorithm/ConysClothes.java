package org.study.algorithm;

import java.util.*;

public class ConysClothes {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (String[] item : clothes) {
            String key = item[1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int[] items = new int[map.size()];
        int idx = 0;
        int result = 1;
        for (int i : map.values()) {
            items[idx] = i + 1;
            result *= items[idx];
            idx++;
        }

        return result - 1;
    }
}
