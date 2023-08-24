package org.study.algorithm;

public class TriangleValidator2 {
    public static void main(String[] args) {
        TriangleValidator2 instance = new TriangleValidator2();
        int[] sides = {5, 5, 3};
        System.out.println(instance.solution(sides));  // Output should be 1
    }

    public int solution(int[] sides) {
        // 변수 초기화
        int longestSide = 0;
        int sumOfOtherSides = 0;

        // 가장 긴 변을 찾고, 나머지 변의 합을 계산
        for (int side : sides) {
            if (side > longestSide) {
                sumOfOtherSides += longestSide;  // 이전의 가장 긴 변을 합계에 추가
                longestSide = side;  // 새로운 가장 긴 변을 설정
            } else {
                sumOfOtherSides += side;  // 가장 긴 변이 아니면 합계에 추가
            }
        }

        // 삼각형의 조건을 검사
        if (longestSide < sumOfOtherSides) {
            return 1;  // 삼각형을 만들 수 있음
        }
        return 2;  // 삼각형을 만들 수 없음
    }
}
