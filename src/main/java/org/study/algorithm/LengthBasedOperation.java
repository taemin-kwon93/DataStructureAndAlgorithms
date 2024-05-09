package org.study.algorithm;

import java.util.Arrays;

public class LengthBasedOperation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println(solution(a));
        System.out.println(solution(b));
    }

    private static int solution(int[] a) {
        return (a.length < 11)? Arrays.stream(a).reduce(1, (x, y) -> x * y) : Arrays.stream(a).sum();
    }
}
