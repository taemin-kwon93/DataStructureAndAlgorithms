package org.study.parksangkhil;

import java.util.HashMap;

public class ClimbingStairs {
    static int count = 0;

    public int climbStairs(int n) {
        dp(n, 0);
        return count;
    }

    public static void dp(int n, int x) {
        if (x == n) {
            count++;
        } else if (x < n){
            dp(n, x + 1);
            dp(n, x + 2);
        }
    }

    private final HashMap<Integer, Integer> memo = new HashMap<>();

    public int climbStairsMemo(int n) {
        return dp(n);
    }

    private int dp(int n) {
        if (n == 0) return 1; // 정상 도착
        if (n < 0) return 0; // 불가능한 경우

        // 이미 계산한 값이 있으면 반환
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // 계산하고 메모리에 저장
        int result = dp(n - 1) + dp(n - 2);
        memo.put(n, result);

        return result;
    }
}
