package org.study.algorithm;

import java.util.*;

public class KthNumber {
    public int[] solution(int[] array, int[][] command) {
        int[] answer = new int[command.length];
        int idx = 0;

        for (int[] rangeAndIndex : command) {
            int[] tmp = new int[rangeAndIndex[1] - rangeAndIndex[0] + 1];
            int tmpIdx = 0;

            for (int i = rangeAndIndex[0] - 1; i <= rangeAndIndex[1] - 1; i++) {
                tmp[tmpIdx++] = array[i];
            }
            Arrays.sort(tmp);

            answer[idx++] = tmp[rangeAndIndex[2] - 1];
        }

        return answer;
    }
}
