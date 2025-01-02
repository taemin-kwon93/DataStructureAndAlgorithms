package org.study.algorithm;

public class LongJump {
    public int solution(int n) {
        int[] dp = new int[n + 1];

        // 초기값 설정
        dp[1] = 1;
        if (n > 1) dp[2] = 2;

        // 점화식 적용
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}
