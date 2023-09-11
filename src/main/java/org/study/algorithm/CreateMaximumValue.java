package org.study.algorithm;

import java.util.Arrays;

public class CreateMaximumValue {
    public static void main(String[] args) {
        CreateMaximumValue solve = new CreateMaximumValue();
        int answer = solve.solution(new int[]{1, 2, -3, 4, -5});
        System.out.println(answer);
    }

    public int solution(int[] numbers) {
        int y = numbers.length;
        int x[] = Arrays.stream(numbers).sorted().toArray();
        // Arrays.sort(numbers); numbers 배열 자체를 sort하고도 문제를 풀 수 있다.
        return ((x[y - 1] * x[y - 2]) > (x[0] * x[1])? x[y - 1] * x[y - 2] : x[0] * x[1]);
    }
}
