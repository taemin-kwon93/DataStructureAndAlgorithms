package org.study.algorithm;

public class SliceArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int x = 1;
        int y = 3;
        int[] slicedNumbers = solution(numbers, x, y);
    }

    private static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = 0; i < num2 - num1 + 1; i++) {
            answer[i] = numbers[num1 + i];
            System.out.print("\033[95m" +  answer[i] + " " + "\033[0m");
        }

        return answer;
    }
}

// "\033[95m" + total + "\033[0m"