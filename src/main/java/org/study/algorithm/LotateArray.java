package org.study.algorithm;

public class LotateArray {
    public static int[] solution(int[] numbers, String direction){
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            for(int i = 0; i < numbers.length; i++) {
                if (i - 1 >= 0)
                    answer[i] = numbers[i - 1];
            }
            answer[0] = numbers[numbers.length - 1];

        } else {
            for(int i = 0; i < numbers.length; i++) {
                if ((i + 1) < numbers.length){
                    answer[i] = numbers[i + 1];
                } else {
                    answer[i] = numbers[i];
                }
            }
            answer[numbers.length - 1] = numbers[0];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = solution(new int[]{1, 2, 3}, "right");
    }
}
