package org.study.algorithm;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class NationalCompetitionSelection {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[3];
        int counter = 0;

        for (int i = 0; i < rank.length; i++) {
            // key: 순위, value: 인덱스
            map.put(rank[i], i);
        }

        // 순위 정렬
        Arrays.sort(rank);

        // 순위에 따라 정렬된 값을 이용해 1, 2, 3등 추출
        for (int i : rank) {
            if (attendance[map.get(i)] && counter < 3) {
                answer[counter] = map.get(i);
                counter++;
            }
        }

        return (answer[0] * 10000) + (answer[1] * 100) + answer[2];
    }
}
