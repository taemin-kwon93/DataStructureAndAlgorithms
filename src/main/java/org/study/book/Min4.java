package org.study.book;

/**
 * 네 값의 최솟값을 구하는 min3 메서드 작성.
 */
public class Min4 {
    public static void main(String[] args) {
        int result = min4(2, 3, 5, 1);
        System.out.println(result);
    }

    private static int min4(int a, int b, int c, int d) {
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        if(min > d) min = d;
        return min;
    }
}
