package org.study.book;

import java.util.Arrays;
import java.util.Scanner;

public class RecurMemo {
    static String[] memo;

    static void recur (int n) {
        if (memo[n + 1] != null) System.out.println("memo: " + memo[n + 1]); // 메모된 내용 출력
        else {
            if (n > 0){
                recur(n - 1);
                System.out.println("출력: " + n);
                recur(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1]; // 메모화
                System.out.println("메모화 : " + memo[n+1]);
            } else {
                memo[n + 1] = "";
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int x = stdIn.nextInt();
        memo = new String[x + 2];
        recur(x);
        System.out.println("Arrays.toString(memo): " + Arrays.toString(memo));
    }
}
