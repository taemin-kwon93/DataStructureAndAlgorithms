package org.study.algorithm;

import java.util.*;

public class KoreanScrabbleGame {
    public int[] solution(int n, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        String prev = words[0];
        int counter = 0;
        map.put(words[0], counter++);


        for (int i = 1; i < words.length; i++) {
            if (map.containsKey(words[i]) || prev.charAt(prev.length() -1) != words[i].charAt(0)) {
                map.put(words[i], counter);
                return new int[] {(map.get(words[i]) % n) + 1, (map.get(words[i]) / n) + 1};
            } else {
                prev = words[i];
                map.put(words[i], counter++);
            }
        }

        return new int[] {0, 0};
    }
}
