package org.study.algorithm;

import java.util.ArrayList;

public class Divisors {
    private static ArrayList solution(int n) {
        ArrayList answer = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer.add(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayList<Integer> answer = solution(24);
        answer.forEach(System.out::println);

    }
}
