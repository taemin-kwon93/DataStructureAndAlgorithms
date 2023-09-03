package org.study.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SelectorOddNumbers {
    public static void main(String[] args) {
        SelectorOddNumbers solve = new SelectorOddNumbers();
        int[] answer = solve.solution(15);
        System.out.println(Arrays.toString(answer)); // [1, 3, 5, 7, 9, 11, 13, 15]
        int[] answer2 = solve.solution2(10);
        System.out.println(Arrays.toString(answer2)); // [1, 3, 5, 7, 9]
        int[] answer3 = solve.solution3(17);
        System.out.println(Arrays.toString(answer3)); // [1, 3, 5, 7, 9, 11, 13, 15, 17]

    }

    public int[] solution(int n) {
        int numOfElements = (n % 2 == 0)? n/2 : n/2 + 1;
        int[] answer = new int[numOfElements];
        int index = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                answer[index++] = i;
            }
        }

        return answer;
    }

    public int[] solution2(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) answer.add(i);
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }

    public int[] solution3(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 != 0).toArray();
    }
}
