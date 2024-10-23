package org.study.algorithm;

public class JumpOrWarp {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            int remain = n % 2;
            n /= 2;
            answer += remain;
        }
        return answer;
    }
}
