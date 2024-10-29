package org.study.algorithm;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int totalTiles = brown + yellow; // 전체 타일 개수

        // 약수 쌍을 탐색 (가로 >= 세로)
        for (int height = 1; height <= Math.sqrt(yellow); height++) {
            if (yellow % height == 0) {
                int width = yellow / height;

                // 전체 타일 크기와 일치하는지 검사
                if ((width + 2) * (height + 2) == totalTiles) {
                    return new int[] {width + 2, height + 2};
                }
            }
        }

        // 조건에 맞는 값이 없을 경우 빈 배열 반환
        return new int[] {};
    }
}
