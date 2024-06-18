package org.study.algorithm;

import java.util.Set;
import java.util.HashSet;

public class Factorization {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();

        int num = 2;
        int x = n;
        System.out.println(n);

        while (num <= x) {
            if (n % num == 0) {
                n /= num;
                set.add(num);
            } else {
                num++;
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
