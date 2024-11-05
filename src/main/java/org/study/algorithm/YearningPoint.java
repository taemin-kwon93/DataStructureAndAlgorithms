package org.study.algorithm;

import java.util.*;

public class YearningPoint {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int j = 0; j < photo.length; j++) {
            for (int k = 0; k < photo[j].length; k++) {
                if (map.containsKey(photo[j][k])) {
                    answer[j] += map.get(photo[j][k]);
                }
            }
        }

        return answer;
    }
}
