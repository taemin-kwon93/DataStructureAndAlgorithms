package org.study.bohyohshibata;

/**
 * 세 값의 최솟값을 구하는 min3 메서드 작성.
 */
public class Min3 {
    public static void main(String[] args) {
        int result = min3(2, 3, 5);
        System.out.println(result);
    }

    private static int min3(int a, int b, int c) {
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        return min;
    }
}
