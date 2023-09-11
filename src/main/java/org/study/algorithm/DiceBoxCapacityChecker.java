package org.study.algorithm;

public class DiceBoxCapacityChecker {
    public static void main(String[] args) {
        DiceBoxCapacityChecker checker = new DiceBoxCapacityChecker();
        int answer = checker.solution(new int[]{10,8,6}, 3);
        System.out.println(answer);
    }

    public int solution(int[] x, int n) {
        return (x[0] / n) * (x[1] / n) * (x[2] / n);
    }
}
