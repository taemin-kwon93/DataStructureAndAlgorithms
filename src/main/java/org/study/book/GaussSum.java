package org.study.book;

import java.util.Scanner;

public class GaussSum {
//    Scanner stdIn = new Scanner(System.in);

    public static void main(String[] args) {
        GaussSum gaussSum = new GaussSum();
        int result = gaussSum.genericForSumMethod(9);
        System.out.println("result: " + result);
        int result2 = gaussSum.gaussSumMethod(9);
        System.out.println(result2);
    }

    public int genericForSumMethod(int n) {
        int sum = 0;
        for (int i =  1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int gaussSumMethod(int n) {
        int sum = 0;
        double remain = 0;
        if((n % 2) == 1) remain = 0.5;
        double med = (n / 2) + remain;
        sum = (int)((1 + n) * med);
        return sum;
    }

}
