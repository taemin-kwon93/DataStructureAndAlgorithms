package org.study.algorithm;

public class SequenceAndIntervalQuery2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            answer[i] = 1000001;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (queries[i][2] < arr[j] && arr[j] < answer[i]) {
                    answer[i] = arr[j];
                }
            }
            if (answer[i] == 1000001) answer[i] = -1;
        }

        return answer;
    }
}
