package org.study.algorithm;

public class CompareOperationValues {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt((Integer.toString(a) +Integer.toString(b))), a * b * 2);
    }

    public int solution2(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), a * b * 2);
    }
}
