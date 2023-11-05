package org.study.book;

import java.util.Scanner;

public class EuclidGCD2 {
    static int gcd(int x, int y, int z) {
        if(z == 0 && y == 0) return x;
        else return gcd(z, x % z, y % z);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int a = stdIn.nextInt(); // 큰수

        System.out.print("정수 입력: ");
        int b = stdIn.nextInt(); // 작은 수

        System.out.print("정수 입력: ");
        int c = stdIn.nextInt(); // 작은 수

        int answer = gcd(a, b, c);
        System.out.println(answer);
    }
}
