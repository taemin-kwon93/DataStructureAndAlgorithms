package study.algorithm;

import java.util.Arrays;

public class SliceArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        System.out.println("Test 배열 값 확인: " + Arrays.toString(input));
        System.out.println("함수 테스트" + Arrays.toString(solution(input, 1, 3)));
    }

    private static int[] solution(int[] numbers, int x, int y) {
        return Arrays.copyOfRange(numbers, x, y + 1);
    }
}
