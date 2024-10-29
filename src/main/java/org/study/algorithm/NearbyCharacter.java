package org.study.algorithm;

import java.util.*;

public class NearbyCharacter {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int[] answer = new int[s.length()];
        int idx = 0;

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int i = map.get(c);
                answer[idx] = idx - i;
                map.put(c, idx);
            } else {
                map.put(c, idx);
                answer[idx] = -1;
            }
            idx++;
        }

        return answer;
    }
}
