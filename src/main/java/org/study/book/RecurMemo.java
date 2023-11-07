package org.study.book;

import java.util.Arrays;
import java.util.Scanner;

public class RecurMemo {
    static String[] memo;
    static int counter = 0;

    static void recur (int n) {
        counter++;
        if (memo[n + 1] != null) System.out.println("memo: " + memo[n + 1]); // 메모된 내용 출력
        else {
            if (n > 0){
                recur(n - 1);
                System.out.println("실행 2");
                System.out.println("출력: " + n);
                recur(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1]; // 메모화
                System.out.println("메모화 : " + memo[n+1]);
            } else {
                System.out.println("실행 1");
                memo[n + 1] = "";
            }
        }
    }

    public static void main(String[] args) {
        int x = 4;
        memo = new String[x + 2];
        recur(x);
        System.out.println("Arrays.toString(memo): " + Arrays.toString(memo));
        System.out.println("count: " + counter);
    }
}
