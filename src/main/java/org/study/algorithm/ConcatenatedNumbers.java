package org.study.algorithm;

public class ConcatenatedNumbers {
    public int solution(int[] numbers) {
        int result = 0;
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i : numbers) {
            if (i % 2 == 0) {
                even.append(i);
            } else {
                odd.append(i);
            }
        }

        result = Integer.parseInt(String.valueOf(odd)) + Integer.parseInt(String.valueOf(even));
        return result;
    }
}
