package org.study.algorithm;

/**
 * <p>문제설명</p>
 * Finn은 요즘 수학공부에 빠져 있습니다.
 * 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다.
 * 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
 * 1 + 2 + 3 + 4 + 5 = 15
 * 4 + 5 + 6 = 15
 * 7 + 8 = 15
 * 15 = 15
 * 자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
 * <p>제한사항</p>
 * n은 10,000 이하의 자연수 입니다.
 */
public class NumberExpression {
    public int solution(int n) {
        int i = 0;
        int x;
        int counter = 0;

        while (i <= n) {
            x = 0;
            i++;

            for (int j = i; j <= n; j++) {
                x += j;
                if (x == n) {
                    counter++;
                    break;
                } else if (x > n) {
                    break;
                }
            }
        }
        return counter;
    }
}
