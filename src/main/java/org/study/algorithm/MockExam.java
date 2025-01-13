package org.study.algorithm;

import java.util.*;

public class MockExam {
    public int[] solution(int[] answers) {
        int[] result = new int[3];
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int aLen = a.length;
        int bLen = b.length;
        int cLen = c.length;

        for (int i = 0; i < answers.length; i++) {
            int num = answers[i];
            if (num == a[i % aLen]) result[0]++;
            if (num == b[i % bLen]) result[1]++;
            if (num == c[i % cLen]) result[2]++;
        }
        List<Integer> list = new ArrayList<>();

        int[] sortedResult = result.clone();
        Arrays.sort(sortedResult);
        for (int j = 0; j < result.length; j++) {
            if (result[j] == sortedResult[sortedResult.length - 1]) list.add(j + 1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
