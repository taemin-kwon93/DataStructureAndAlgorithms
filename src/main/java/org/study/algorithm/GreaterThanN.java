package org.study.algorithm;

/**
 * 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
 * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
 * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
 * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
 * 예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
 * 자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
 */
public class GreaterThanN {
    public int solution(int n) {
        // use standard library function
        String s1 = Integer.toBinaryString(n);
        String s2 = Integer.toBinaryString(n + 1);

        int x = 0;
        int y = 0;

        for (char c1 : s1.toCharArray()) {
            if (c1 == '1') x++;
        }

        for (char c2 : s2.toCharArray()) {
            if (c2 == '1') y++;
        }

        int idx = 2;
        while (x != y) {
            y = 0;

            s2 = Integer.toBinaryString(n + idx++);
            for (char c2 : s2.toCharArray()) {
                if (c2 == '1') y++;
            }
        }

        return Integer.parseInt(s2, 2);
    }
}
