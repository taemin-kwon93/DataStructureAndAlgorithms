package org.study.algorithm;

public class EntryScreening {
    public long solution(int n, int[] times) {
        long start = 1;
        long end = (long) n * getMax(times);  // 가능한 최대 시간 설정
        long answer = end;

        while (start <= end) {
            long mid = (start + end) / 2;  // 중간값 설정
            long people = 0;

            // 모든 심사관이 mid 시간 내에 처리할 수 있는 사람 수 계산
            for (int time : times) {
                people += mid / time;
            }

            if (people >= n) {  // n명 이상 처리 가능하면 시간을 줄임
                answer = mid;
                end = mid - 1;
            } else {  // 처리할 수 있는 인원이 부족하면 시간을 늘림
                start = mid + 1;
            }
        }

        return answer;
    }

    // 배열에서 최대값 찾기
    private long getMax(int[] times) {
        long max = 0;
        for (int time : times) {
            max = Math.max(max, time);
        }
        return max;
    }
}
