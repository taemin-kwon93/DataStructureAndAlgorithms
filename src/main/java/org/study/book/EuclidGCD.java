package org.study.book;

import java.util.Scanner;

public class EuclidGCD {
    static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("큰수 입력: ");
        int a = stdIn.nextInt(); // 큰수

        System.out.print("작은수 입력: ");
        int b = stdIn.nextInt(); // 작은 수

        int answer = gcd(a, b);
        System.out.println(answer);
    }
}
