package org.study.algorithm;

public class LastTwoElements {
    public int[] solution(int[] x) {
        int y = x.length;
        int[] result = new int[y + 1];
        for (int i = 0; i < y; i++) {
            result[i] = x[i];
        }
        // 마지막 원소가 그 전 원소보다 크면 그전 원소값을 뺀 값을 추가
        // 마지막 원소가 그 전 원소보다 크지 않다면 마지막 원소를 두배한 값을 추가
        result[result.length - 1] = (x[y -2] < x[y - 1]) ?
                                    x[y - 1] - x[y - 2] :
                                    x[y - 1] * 2;
        return result;
    }
}
