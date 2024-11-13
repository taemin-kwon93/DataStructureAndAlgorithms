package org.study.algorithm;

import java.util.*;

/**
 * n번 이상 인용된 논문
 * n개 이상 있을 경우
 * 그 최대값이 H index 다.
 */
public class Hindex {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++){
            int smaller = Math.min(citations[i], citations.length - i);
            answer = Math.max(answer, smaller);
        }
        return answer;
    }
}
