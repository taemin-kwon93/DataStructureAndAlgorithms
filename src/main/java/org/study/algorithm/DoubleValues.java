package org.study.algorithm;

import java.util.Arrays;

public class DoubleValues {
    public static void main(String[] args) {
        DoubleValues dv = new DoubleValues();
        int[] x = {1, 2, 3, 4, 5};
        dv.solution(x);
    }
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
