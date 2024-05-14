package org.study.algorithm;

import java.util.List;
import java.util.ArrayList;

import java.util.Arrays;

public class ArrayMaker1 {
    public static void main(String[] args) {
        int[] a = solution(10, 3);
        int[] b = solution2(10, 3);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    private static int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) if (i % k == 0) answer.add(i);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] solution2(int n, int k) {
        int[] y = new int[n / k];
        int index = 0;
        for (int z = 1; z <= n; z++) if (z % k == 0) y[index++] = z;
        return y;
    }
}
