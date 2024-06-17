package org.study.algorithm;

public class CountSevens {
    public int solution(int[] array) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();

        for (int i : array) sb.append(i);
        for (char c : sb.toString().toCharArray()) if (c == '7') counter++;

        return counter;
    }
}
