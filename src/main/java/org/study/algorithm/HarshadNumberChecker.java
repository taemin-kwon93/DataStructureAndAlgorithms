package org.study.algorithm;

public class HarshadNumberChecker {
    public boolean solution(int x) {
        String s = String.valueOf(x);
        int[] ia = new int[s.length()];
        int counter = 0;
        int sumCaNumbes = 0;

        for (char c : s.toCharArray()) ia[counter++] = c - 48;
        for (int i : ia) sumCaNumbes += i;

        return x % sumCaNumbes == 0 ? true : false;
    }
}
