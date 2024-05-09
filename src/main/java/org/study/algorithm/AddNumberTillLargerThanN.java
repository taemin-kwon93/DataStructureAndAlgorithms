package org.study.algorithm;

public class AddNumberTillLargerThanN {
    public static void main(String[] args) {
        int[] a = {34, 5, 71, 29, 100, 34};
        int[] a2 = {58, 44, 27, 10, 100};
        int b = 123;
        int b2 = 139;
        int result = solution(a, b);
        System.out.println();
        int result2 = solution(a2, b2);
        System.out.println("\nresult1: " + result); // 139
        System.out.println("\nresult2: " + result2); // 239
    }

    private static int solution(int[] a, int b) {
        int answer = 0;
        int count = 0;
        while(answer <= b) {
            answer += a[count++];
        }
        return answer;
    }
}
