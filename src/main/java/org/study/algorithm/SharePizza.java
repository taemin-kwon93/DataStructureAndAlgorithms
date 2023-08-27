package org.study.algorithm;

public class SharePizza {
    public static void main(String[] args) {
        SharePizza sharePizza = new SharePizza();
        int answer = sharePizza.solution(7, 10);
        System.out.println(answer);
    }

    public int solution(int slice, int n) {
        return ((n % slice) != 0)? (n / slice) + 1 : n / slice;
    }
}
