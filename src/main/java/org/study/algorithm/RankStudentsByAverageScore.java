package org.study.algorithm;

import java.util.Arrays;

public class RankStudentsByAverageScore {
    public int[] solution(int[][] score) {
        int n = score.length;
        double[] averages = new double[n];
        Integer[] indices = new Integer[n];

        // 평균을 계산하고 인덱스를 저장
        for (int i = 0; i < n; i++) {
            averages[i] = (score[i][0] + score[i][1]) / 2.0;
            indices[i] = i;
        }

        // 내림차순으로 해당 평균 점수를 기준으로 인덱스를 정렬합니다.
        Arrays.sort(indices, (o1, o2) -> Double.compare(averages[o2], averages[o1]));

        // ranks 배열을 생성하고 동점에 대한 처리를 함
        int[] ranks = new int[n];
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && averages[indices[i]] == averages[indices[i - 1]]) {
                ranks[indices[i]] = ranks[indices[i - 1]];
            } else {
                ranks[indices[i]] = rank;
            }
            rank++;
        }

        return ranks;
    }
}
