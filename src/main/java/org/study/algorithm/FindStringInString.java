package org.study.algorithm;

public class FindStringInString {
    public static void main(String[] args) {
        String a = "AbCdEfG";
        String b = "aBc";

        int result = solution(a, b);
        System.out.println(result);
    }

    private static int solution(String a, String b) {
        return (a.toLowerCase().contains(b.toLowerCase()))? 1 : 0;
    }
}
