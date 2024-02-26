package org.study.bohyohshibata;

/**
 * 네 값의 최대값을 구하는 max4 메서드 작성.
 */
public class Max4 {
    public static void main(String[] args) {
        int result = max4(2, 3, 5, 1);
        System.out.println(result);
    }

    private static int max4(int a, int b, int c, int d) {
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        if(max < d) max = d;
        return max;
    }
}
