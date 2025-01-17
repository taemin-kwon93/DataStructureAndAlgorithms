package org.study.algorithm;

public class Fatigue {
    static int max;

    public int solution(int k, int[][] dungeons) {
        max = 0;
        boolean[] visited = new boolean[dungeons.length];
        backtrack(k, 0, dungeons, visited);
        return max;
    }

    private static void backtrack(int k, int m, int[][] dungeons, boolean[] visited) {
        // 최대 탐험 횟수 갱신
        max = Math.max(m, max);
        // 모든 던전 탐색
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i]) {
                int need = dungeons[i][0];
                int minus = dungeons[i][1];

                // 현재 체력으로 던전을 탐험할 수 없는 경우
                if (k < need) continue;

                // 던전 탐험
                visited[i] = true;
                backtrack(k - minus, m + 1, dungeons, visited);

                // 백트래킹: 던전 탐험 취소
                visited[i] = false;
            }
        }
    }
}
