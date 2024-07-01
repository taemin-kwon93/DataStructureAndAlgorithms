package org.study.parksangkhil;

import java.util.Arrays;

/**
 * 한 번의 거래로 낼 수 있는 최대 이익을 산출하라.
 * 입력: [8, 1, 5, 3, 6, 4]
 * 출력: 5
 * 설명: 1일때 사서 6일 때 팔면 최대 5의 이익을 얻는다.
 */
public class SellStock {
    public int solution(int[] x) {
        int min = Math.min(x[0], x[1]);
        int[] answer = new int[x.length];

        for (int i = 1; i < x.length; i++) {
            min = Math.min(x[i], min);
            answer[i] = x[i] - min;
        }

        Arrays.sort(answer);
        return answer[answer.length - 1];
    }

    public int solutionB(int[] x) {
        int max = 0;
        int min = x[0];

        for (int i : x) {
            min = Math.min(i, min);
            max = Math.max(i - min, max);
        }

        return max;
    }
}
