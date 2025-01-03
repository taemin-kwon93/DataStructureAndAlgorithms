package org.study.algorithm;

public class CutArray {
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            int a = (int) ((left + i) / n);
            int b = (int) ((left + i) % n);
            answer[i] = Math.max(a, b) + 1;
        }

        return answer;
    }
}
