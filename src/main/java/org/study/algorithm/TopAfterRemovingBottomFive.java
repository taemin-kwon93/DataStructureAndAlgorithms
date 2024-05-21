package org.study.algorithm;

import java.util.Arrays;

/**
 * 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */

public class TopAfterRemovingBottomFive {
    public int[] solution(int[] num_list) {
        int[] sortedNumbers = Arrays.stream(num_list).sorted().toArray();
        int[] answer = new int[sortedNumbers.length - 5];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = sortedNumbers[i + 5];
        }
        return answer;
    }

    public int[] solution2(int[] num_list) {
        return Arrays.stream(num_list).sorted().skip(5).toArray();
    }
}
