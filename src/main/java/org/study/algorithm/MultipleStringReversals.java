package org.study.algorithm;

public class MultipleStringReversals {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();
        char[] chars = my_string.toCharArray();

        for (int[] query : queries) {
            swap(chars, query[0], query[1]);
        }

        sb.append(chars);
        return sb.toString();
    }

    private static void swap(char[] chars, int a, int b) {
        for (int i = 0; i <= (b - a) / 2; i++) {
            char tmp = chars[a+i];
            chars[a+i] = chars[b-i];
            chars[b-i] = tmp;
        }
    }
}
