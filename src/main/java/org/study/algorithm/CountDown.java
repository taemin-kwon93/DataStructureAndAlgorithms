package org.study.algorithm;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

public class CountDown {
    public static void main(String[] args) {
        int[] a = solution(10, 3);
        System.out.println(Arrays.toString(a));
    }

    private static int[] solution(int start, int end_num) {
        List<Integer> countDown = new ArrayList<>();
        int x = start;
        for (int i = 0; i <= start - end_num; i++) {
            countDown.add(x--);
        }
        return countDown.stream().mapToInt(Integer::intValue).toArray();
    }
}
